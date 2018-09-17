package arraystack;

public class ArrayStack {
	int [] stack;
	int top;
	public ArrayStack(int capacity)
	{
		stack = new int[capacity];
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
	
}
