package Сollections.Sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();    //неупоряд
        Set set1 = new LinkedHashSet(); //упоряд
        Set set2 = new TreeSet();   //отсортиров
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("1");
        set.add("1");

        for (Object o : set){
            System.out.println(o);
        }
    }
}
