import java.util.*;

public class armazenar
{
	private String courseName;
	private  int grades[][];

	public armazenar(String nome, int gradesArray[][])
	{
		courseName = nome;
		grades = gradesArray;
	}

	public void setCourseName(String nome)
	{
		courseName = nome;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void displayMessage()
	{
		System.out.printf("Bem-vindo na grade book\n%s!\n\n",getCourseName());
	}

	public void processGrades()
	{
		outputGrades();

		System.out.printf("\n%s %d\n%s %d\n\n","Nota minima no grade book é: ",getMinimum(),"Nota maxíma no grade book é: ",getMaximum());

		outputBarChar();
	}

	public int getMinimum()
	{
		int lowGrade = grades[0][0];

		for (int studentGrades[] : grades) 
		{
			for (int grade : studentGrades) 
			{
				if (grade < lowGrade) 
				{
					lowGrade = grade;
				}
			}
		}
		return lowGrade;
	}

	public int getMaximum()
	{
		int highGrade = grades[0][0]; 

		for (int studentGrades[] : grades) 
		{
			for (int grade : studentGrades) 
			{
				if (grade > highGrade) 
				{
					highGrade = grade;
				}
			}
		}
		return highGrade;
	}

	public double getAverage(int setOfGrades[])
	{
		int total;

		total = 0;

		for (int grade : setOfGrades) 
		{
			total += grade;
		}
		return (double) total / setOfGrades.length;
	}

	public void outputBarChar()
	{
		System.out.println("Distribuição da grade: ");

		int frequencia[] = new int[11];
		int count;
		int stars;

		for (int studentGrades[] : grades) 
		{
			for (int grade : studentGrades) 
			{
				++frequencia[grade/10];	
			}
		}

		for (count = 0;count < frequencia.length;count++) 
		{
			if (count == 10) 
			{
				System.out.printf("%5d: ",100);
			}

			else
			{
				System.out.printf("%02d-%02d: ",count * 10,count * 10+9);	
			}

			for (stars = 0; stars < frequencia[count]; stars++) 
			{
				System.out.println("*");
			}
			System.out.println("");
		}
	}

	public void outputGrades()
	{
		int student;
		int test;

		System.out.println("A grades são: ");
		System.out.print("          ");

		for (test = 0; test < grades[0].length; test++) 
		{
			System.out.printf("Test %d",test + 1);	
		}

		System.out.println("Average");	

		for (student = 0; student < grades.length;student++) 
		{
			System.out.printf("student %2d",student++);

			for (int tests : grades[student]) 
			{
				System.out.printf("%8d",tests);	
			}

			double average = getAverage(grades[student]);
			System.out.printf("%9.2f\n",average);		
		}
	}
}