import java.util.Scanner;

public class Comprimento
{
	// atributos da classe comprimento  
	private double comprimento; 
	private double altura; 

	// o metodo construtor 
	public Comprimento(double comprimento, double altura)
	{
		this.comprimento = comprimento;
		this.altura = altura;
	}

	// Os dois metodos getter da classe comprimento 
	public double getComprimento()
	{
		return this.comprimento;
	}

	public double getAltura()
	{
		return this.altura;
	}
	
	// este metodo calcula a area do terreno 
	public double calcularArea()  
	{
		return comprimento * altura;
	}

	// Este metodo calcula a quantidade de azulejos a serem usados 
	public int calcularQtdAzulejos(double area)  
	{
		return (int)area * 9;
	}

	// Este metodo determina o valor gasto 
	public double calcularValorGasto(int qtd_azulejos)
	{
		return (double) qtd_azulejos * 2.5;
	}

	// Este metodo imprime uma frase 
	public void imprimeFrase(String frase)  
	{
		System.out.println(frase);
	}

	public static void main(String[] args)
	{
		// Para leitura dos dados de entrada comprimento e altura 
		// usa-se a classe Scanner 
		cls();
		Scanner in = new Scanner(System.in);

		System.out.print("Insere o comprimento em metros: ");
		// Este metodo vai ler do teclado um valor double 
        double comprimento = in.nextDouble();
        System.out.print("Insere a altura em metros: ");
        // Este metodo vai ler do teclado um valor double 
        double altura = in.nextDouble();

        // Aqui se esta instanciando a classe comprimento  
        // na verdade estamos criando um objeto da classe comprimento  
		Comprimento exemplo = new Comprimento(comprimento, altura);

		// calcula-se a area do terreno
		double area = exemplo.calcularArea();
		// determina-se a quantidade de azulejos a serem usados 
		int qtd_azulejos = exemplo.calcularQtdAzulejos(area);
		// calcula-se o valor gasto 
		double gasto_azulejos = exemplo.calcularValorGasto(qtd_azulejos);

		// imprimi-se os resultados obtidos 
		String resposta1 = "", resposta2 = "";
		resposta1 = "\nQuantidade de azulejos necessaria: " + qtd_azulejos;
		exemplo.imprimeFrase(resposta1);
		resposta2 = "Valor gasto com azulejos: R$ " + gasto_azulejos;
		exemplo.imprimeFrase(resposta2);
	}

	// classe limpar a tela do cmd 
	public static void cls() 
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch (final Exception E) 
		{
			System.out.println(E);
		}
	}

} // fim da classe