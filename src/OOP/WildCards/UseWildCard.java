package OOP.WildCards;

import java.util.ArrayList;
import java.util.Collection;


//PECS stands for producer-extends, consumer-super
//Do not use wildcard types as return types

public class UseWildCard {
    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<Number>();
        Iterable<Integer> integers = new ArrayList<>();

        numberStack.pushAll(integers);

        Collection<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);
    }
}

