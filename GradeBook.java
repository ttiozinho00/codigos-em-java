import java.util.Scanner;
import java.util.*;

public class GradeBook
{
	private String CursoNome;

	public GradeBook(String nome)
	{
		CursoNome = nome;
	} 

	public void setCusoNome(String nome)
	{
		CursoNome = nome;	
	}

	public String getCusoNome()
	{
		return CursoNome;
	}

	public void DisplayMessage()
	{
		System.out.printf("Bem-Vindo no GradeBook \n%s\n\n",getCusoNome());
	}

	public void determineClassAverage()
	{
		Scanner leitura = new Scanner(System.in);

		int gradeCounter;
		int average;
		int total;
		int grade;

		total = 0;
		gradeCounter = 1;

		while(gradeCounter <= 10)
		{
			System.out.print("Informe a nota: ");
			grade = leitura.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		average = total/10;

		System.out.printf("\nTotal das 10 notas é: %d\n",total);
		System.out.printf("Class average é: %d\n",average);
	}
}