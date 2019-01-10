package OOP.AnonClass;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

class Popcorn{
    void doSomething(){
        System.out.println("popcorn");
    }
    void secondMethod(){
        System.out.println("second");
    }

}

public class Main {
    public static void main(String[] args) throws Exception {
//        Popcorn popcorn = new Popcorn(){
//            void doSomething(){
//                System.out.println("main");
//            }
//        };
//        popcorn.doSomething();
//        popcorn.secondMethod();
//
//        Comparable comparable = new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
//        comparable.compareTo(new Object());

        method(new Popcorn() {
            void doSomething() {
                System.out.println("bla");
            }
        });
    }

    static void method(Popcorn popcorn){
        popcorn.doSomething();
    }
}
