package arraystack;

public class ArrayStack {
	int [] stack;
	int top;
	public ArrayStack(int size)
	{
		stack = new int[size];
		top = -1;
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
	
}
