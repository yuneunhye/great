package one.great.greatthing.database;

import java.util.ArrayList;
import java.util.List;

public class Deee {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println("############");
        System.out.println(list.toString());
        System.out.println("############");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
