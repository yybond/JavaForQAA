package OOP.Generics;

import javafx.beans.binding.ObjectExpression;

import java.io.*;
import java.util.*;

class Car extends Main implements  Comparable, Serializable{
    @Override
    public int compareTo(Object o){
        return 0;
    }

}

public class Main <T extends Main & Comparable & Serializable> {

    T var;

    public static void main(String[] args) throws Exception {
        Main<Car> main = new Main<>();
        main.var = new Car();
        main.method(new Car());

    }

    T method (T type){
        type.someMethod();
        return type;
    }

    void someMethod(){
        System.out.println("bla");
    }
}
