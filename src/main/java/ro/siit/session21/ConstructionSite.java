package ro.siit.session21;

import java.util.ArrayList;
import java.util.List;

public class ConstructionSite {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        Worker dorel = new Worker() {
            @Override
            public void doWork(String tool) {
                System.out.println("Am rupt firul de curent cu " + tool + "!");
            }
        };
        workers.add(dorel);

        Worker gigel = (tool) -> System.out.println("Isch mahle shoen mit " + tool + "!");
        workers.add(gigel);

        for (Worker worker : workers) {
            worker.doWork("Sapa");
        }

        workers.forEach((elem) -> elem.doWork("Drujba"));
    }
}
