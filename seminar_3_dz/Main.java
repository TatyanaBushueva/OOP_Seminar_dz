package OOP.seminar_3_dz;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        TwoLinkedList list = new TwoLinkedList();
        list.add("point1");
        list.add("point2");

        list.add(2, "point2_1");
        list.add(3, "point2_2");
        list.add("point3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}