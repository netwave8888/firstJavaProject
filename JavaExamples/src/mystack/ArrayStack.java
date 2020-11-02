package mystack;

public class ArrayStack <Item> implements Stack <Item>
{
    private Item container[];
    private int top;
    private final static int DEFAULT_SIZE = 10;
 
    public ArrayStack ()
    {
        this(DEFAULT_SIZE);
    }
 
    public ArrayStack (int initSize)
    {
        container = (Item[]) new Object [initSize];
        top = -1;
    }
 
    public Item getTop()
    {
        if (top == -1)
            return null;
        return container[top];
    }
 
    public boolean isEmpty()
    {
        return (top == -1);
    }
 
    public Item pop()
    {
        if (top == -1)
            return null;
        return container[top--];
    }
 
    public void push(Item itm)
    {
        container[++top] = itm;
    }
 
    public int size()
    {
        return (top + 1);
    }
    
    public String toString() {
		if(isEmpty()){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		int size = size();
		for(int i=0; i<size; i++){
			sb.append(this.container[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
    
    public static void main(String[] args) {
    	 
		Stack<String> stack = new ArrayStack<String>(11);
		stack.push("hello");
		stack.push("world");
 
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
	}
}