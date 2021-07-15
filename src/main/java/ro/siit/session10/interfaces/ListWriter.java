package ro.siit.session10.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListWriter {
    public void printList(List<String> list){
        for (String element: list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("John");
        new ListWriter().printList(list);

        Vector<String> sameList = new Vector<>();
        sameList.addAll(list);

        new ListWriter().printList(sameList);
    }
}
