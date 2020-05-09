import java.util.*;

static class simplespilha
{
	char data[];
	int tos;

	simplespilha(int size)
	{
		data = new char[size];
		tos = 0;
	}

	void push(char ch)
	{
		if(isFull())
		{
			System.out.println(" -- Pilha está cheia.!!");
			return;
		}
		data[tos] = ch;
		tos++;
	}

	char pop()
	{
		if(isEmpty())
		{
			System.out.println(" -- Pilha está vazia.!!");
			return (char) 0;
		}
		tos--;
		return data[tos];
	}

	boolean isEmpty() 
	{
		return tos==0;
	}

	boolean isFull() 
	{
		return tos==data.length;
	}
}

public class simplespilha
{
	public static void main(String[] args)
	{
		char ch;
		int i;

		System.out.println("Demonstração Pilha simples!!\n");

		SimpleStack stack = new SimpleStack(10);

		System.out.println("Inserir 10 items na pilha!!");
		System.out.print("Inserindo: ");

		for(ch = 'A'; ch < 'K'; ch++)
		{
			System.out.print(ch);
			stack.push(ch);
		}
		System.out.println("\nExtrair os items da pilha.");
		System.out.print("Extráindo : ");

		for(i=0; i < 10; i++)
		{
			ch = stack.pop();
			System.out.print(ch);
		}

		System.out.print("Enchendo: ");

		for(ch = 'A'; !stack.isFull(); ch++)
		{
			System.out.print(ch);
			stack.push(ch);
		}
		System.out.println("");

		System.out.print("Esvaziando: ");

		while(!stack.isEmpty())
		{
			ch = stack.pop();
			System.out.print(ch);
		}

		SimpleStack smallStack = new SimpleStack(4);

		System.out.print("Inserindo: ");
		for(ch = '1'; ch < '6'; ch++) 
		{
			System.out.print(ch);
			smallStack.push(ch);
		}

		System.out.print("Extraindo: ");
		for(i=0; i < 5; i++) 
		{
			ch = smallStack.pop();
			System.out.print(ch);
		}
	}	
}