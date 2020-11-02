package mystack;

public interface MyStackInterface<E> extends Iterable <E> {
	
	E getTop(); // return the top item without removing it from stack
    E pop(); // return the top item and removes it from stack
    void push(E itm); // adds an item to the stack
    boolean isEmpty(); // returns true if stack is empty, false otherwise
    int size();  // returns the number of items in stack right now
    
}
