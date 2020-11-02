package mystack;

import java.util.Iterator;

class MyStackDriver
{
  public static void main (String a[])
  {
    MyStackInterface <Integer> s = new MyStack<Integer>();
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.push(70);
 
    System.out.println("Size of the stack: " + s.size());
 
    // iterate through stack
    System.out.println("Following items pushed to Stack as of now:");
    for (Integer i : s)
      System.out.println(i);	
    
    // use iterator
    s.pop();
    s.pop();
    System.out.println("Following two items pop out");
    
    Iterator<Integer> iterator = s.iterator();
    while ( iterator.hasNext()) {
    	System.out.print(iterator.next() + " ; "); 
    }
    
    
  }
}