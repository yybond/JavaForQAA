package Сollections.ArrayList;

import java.util.*;

class Book{
    String nameAutor;

    public Book (String nameAutor){
      this.nameAutor = nameAutor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAutor='" + nameAutor + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
//        int[] array = new int [10]; // массив

        Map map = new HashMap();
        map.put("1", "Dan Brown");
        map.put("2", new Book("Karnegi"));
        map.put("3", "Jack London");

//        System.out.println(map.get("2"));

        Set set = map.keySet();
        for (Object o : set){
            System.out.println(o);
        }


//        Set collection3 = new HashSet(); // уникальные объекты
//        collection3.add("1");
//        collection3.add("1");
//        collection3.add("2");
//        collection3.add("2");
//        collection3.add("3");
//        collection3.add("1");
//
//        for (Object o : collection3){
//            System.out.println(o);
//        }

//        Queue collection2 = new PriorityQueue();
//        collection2.offer("1");
//        collection2.offer("2");
//        collection2.offer("3");
//
//        Iterator iterator = collection2.iterator();
//        while (iterator.hasNext()){
//            System.out.println(collection2.poll());
//        }
//
//        System.out.println("num of elements " + collection2.size());


//        List collection = new ArrayList();
//        collection.add("1");
//        collection.add(1,"2");
//        collection.add("3");
//        collection.set(2, "4");
//
////        System.out.println(collection.get(1));
//
//        for (int i = 0; i < collection.size(); i++){
//            System.out.println(collection.get(i));
//        }



//        Iterator iterator = collection.iterator();
//
////        while (iterator.hasNext()){
////            System.out.println(iterator.next());
////        }
//
//        for (Object o : collection){
//            System.out.println(o);
//        }
    }
}
