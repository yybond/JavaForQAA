package OOP.WildCards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

class Stack <E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        elements[size++] = e;
    }

    public E pop(){
        if (size==0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public void pushAll(Iterable<? extends E> src){
        for (E e : src)
            push(e);
    }

    public void popAll (Collection<? super E> dst){
        while (!dst.isEmpty())
            dst.add(pop());
    }
}
