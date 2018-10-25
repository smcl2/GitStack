package arraystack;

public class ArrayStack {
	int [] stack;
	int top;
	public ArrayStack(int size)
	{
		stack = new int[size];
		top = -1;
	}
  
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public int pop()
	{
		int topItem = -1;
		if (!isEmpty())
		{
			topItem = stack[top];
		}
		return topItem;
  }
	public boolean isFull()
	{
		return (top == stack.length-1);
	}
	public boolean push(int newItem)
	{
		if (!isFull())
		{
			top++;
			stack[top] = newItem;
			return true;
		}
		else
			return false;
	}
	public int numItems()
	{
		return top+1;
	}
	
}
