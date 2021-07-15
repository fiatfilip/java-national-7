package ro.siit.session10.abstractClasses;

public class CommandLineSorter extends Sorter{
    private String[] args;

    public  CommandLineSorter(String[] args){
        this.args = args;
    }
    @Override
    public void init() {
        for (String cmd: args ) {
            this.numbers.add(Double.parseDouble(cmd));
        }
    }
}
