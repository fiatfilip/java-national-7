package ro.siit.session10.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new CommandLineSorter(args);
        sorter.init();
        sorter.print();
        sorter.getSorted();
        sorter.print();
    }
}
