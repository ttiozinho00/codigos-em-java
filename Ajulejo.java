import java.util.Scanner;

public class Ajulejo
{
	/* atributos da classe Exemplo3 */
	private double comprimento; 
	private double altura; 

	/* o metodo construtor */
	public Ajulejo(double comprimento, double altura)
	{
		this.comprimento = comprimento;
		this.altura = altura;
	}

	/* Os dois metodos getter da classe Exemplo3 */
	public double getComprimento()
	{
		return this.comprimento;
	}

	public double getAltura()
	{
		return this.altura;
	}
	
	/* este metodo calcula a area do terreno */
	public double calcularArea()  
	{
		return comprimento * altura;
	}

	/* Este metodo calcula a quantidade de azulejos a serem usados */
	public int calcularQtdAzulejos(double area)  
	{
		return (int)area * 9;
	}

	/* Este metodo determina o valor gasto */
	public double calcularValorGasto(int qtd_azulejos)
	{
		return (double) qtd_azulejos * 2.5;
	}

	/* Este metodo imprime uma frase */
	public void imprimeFrase(String frase)  
	{
		System.out.println(frase);
	}

	/*public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Insere o comprimento em metros ");
		
        double comprimento = in.nextDouble();
        System.out.println("Insere a altura em metros ");
       
        double altura = in.nextDouble();

		Ajulejo ajulejo = new Ajulejo(comprimento, altura);

		double area = ajulejo.calcularArea();
	
		int qtd_azulejos = ajulejo.calcularQtdAzulejos(area);
	
		double gasto_azulejos = ajulejo.calcularValorGasto(qtd_azulejos);

		String resposta1 = "", resposta2 = "";
		resposta1 = "Quantidade de azulejos necessaria: " + qtd_azulejos;
		ajulejo.imprimeFrase(resposta1);
		resposta2 = "Valor gasto com azulejos: R$ " + gasto_azulejos;
		ajulejo.imprimeFrase(resposta2);
	}*/

} // fim da classe