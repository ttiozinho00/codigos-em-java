public class pessoa
{
	corrente conta;
	private String nome;
	private int idade;

	public pessoa(String nome, int idade, corrente conta)
	{
		this.conta = conta;
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	public int getIdade()
	{
		return idade;
	}
}