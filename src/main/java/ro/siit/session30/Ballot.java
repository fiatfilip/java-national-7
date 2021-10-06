package ro.siit.session30;

import java.util.*;
import java.util.stream.Collectors;

public class Ballot {
    private List<Vote> votes = new ArrayList<>();

    public synchronized void castVote(Vote vote){
        this.votes.add(vote);
    }

    public Integer currentNoOfVoters(){
        return votes.size();
    }

    public void printResults(){
        Map<Candidate, Integer> resultsMap = new HashMap<>();
        for(Candidate candidate: Candidate.values()){
            resultsMap.put(candidate, 0);
        }

        for(Vote vote: votes){
            resultsMap.put(vote.getElectedCandidate(), resultsMap.get(vote.getElectedCandidate()) + 1);
        }

        TreeSet<ElectionResult> finalStandings = new TreeSet<>();
        finalStandings.addAll(
                resultsMap.entrySet()
                        .stream()
                        .map(e -> new ElectionResult(e.getKey(), e.getValue()))
                        .collect(Collectors.toList()));

        finalStandings.stream().forEach(System.out::println);
    }
}
