import java.util.*;

public class Bonificacoes 
{
	private double totalDeBonificacoes = 0;

	public void registra(int f)
	{
		System.out.println("Adicionando bonificação do funcionario: " + f);
		this.totalDeBonificacoes += f;
	}

	public double getTotalDeBonificacoes() 
	{
		return this.totalDeBonificacoes;
	}
}