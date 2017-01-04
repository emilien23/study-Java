package first;

class Stack
{
	private int stack[] = new int[100];
	private int top;
	Stack()
	{
		top = -1;
	}
	void Pop()
	{
		if (top == -1)
			System.out.println("Stack is empty");
		else
			stack[top--] = 0;
			
	}
	void Push(int item)
	{
		if (top == 99)
			System.out.println("Stack is full");
		else
		{
			stack[++top] = item;
		}
	}
	int GetCount()
	{
		if (top < 0)
			return 0;
		else
			return top+1;
	}
	boolean Empty()
	{
		if (top >= 0)
			return false;
		else
			return true;
	}
	int GetTop()
	{
		if (top == -1)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return stack[top];
	}
	void Print()
	{
		for (int x=0; x <= top; x++)
			System.out.println(stack[x]);
	}
}
public class first
{

public static void main(String args[])
	{
		Stack stk = new Stack();
		stk.Push(10);
		stk.Push(12);
		stk.Pop();
		stk.Print();
		System.out.println("Стек пустой? " + stk.Empty());
		System.out.println( "Количество элементов в стеке: " + stk.GetCount());
		stk.Push(11);
		System.out.println("Вершина стека: " + stk.GetTop());
	}

}
