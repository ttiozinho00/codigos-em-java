import java.util.*;

public class Bonificacoes 
{
	private double totalDeBonificacoes = 0;

	public void registra(int f)
	{
		System.out.println("Adicionando bonifica��o do funcionario: " + f);
		this.totalDeBonificacoes += f;
	}

	public double getTotalDeBonificacoes() 
	{
		return this.totalDeBonificacoes;
	}
}