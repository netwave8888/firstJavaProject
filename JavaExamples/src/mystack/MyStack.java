package mystack;

import java.lang.Iterable;
import java.util.*;
 
public class MyStack <E> implements MyStackInterface <E>
{
    private E container[];
    private int top;
    private final static int DEFAULT_SIZE = 10;
 
    public MyStack ()
    {
        this(DEFAULT_SIZE);
    }
 
    public MyStack (int initSize)
    {
        container = (E[]) new Object [initSize];
        top = -1;
    }
 
    public E getTop()
    {
        if (top == -1)
            return null;
        return container[top];
    }
 
    public boolean isEmpty()
    {
        return (top == -1);
    }
 
    public E pop()
    {
        if (top == -1)
            return null;
 
        E itm = container[top];
        container[top--] = null;
 
        if(top > 0 && top == container.length / 4)
           resize (container.length/2);
 
        return itm;
    }
 
    public void push(E itm)
    {		
        if (top == container.length - 1)
            resize(2 * container.length);
 
        container[++top] = itm;
    }
 
    public int size()
    {
        return (top + 1);
    }
 
    private void resize (int newSize)
    {
        E t[] = (E[]) new Object[newSize];
        for (int i = 0; i <= top; i++)
            t[i] = container[i];
        container = t;
    }
 
    public Iterator<E> iterator()
    {
        return new MyStackIterator();
    }
 
    private class MyStackIterator implements Iterator <E>
    {
        private int i = top;
 
        public boolean hasNext()
        {
            return (i > -1);
        }
 
        public E next()
        {
            return container[i--];
        }
 
        public void remove()
        {
           // not needed
        }
    }
}