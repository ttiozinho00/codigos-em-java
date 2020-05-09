import java.util.*;

public class carro
{
	//Atributos
	public boolean freio = true;
	public boolean ligado;
	public int velocidade;
	public String marca;
	private int marcha = 0;
	public int ano;

	// metodos
	public void ligar()
	{

		if (this.ligado == false) 
		{
			this.ligado = true;
			System.out.println("Carro ligado!!");
		}

		else
		{
			System.out.println("O Carro já está ligado!!");	
		}
	}

	public void desligar()
	{
		if (this.ligado == true)
		{
			this.ligado = false;
			System.out.println("Carro Desligado!!\n");
			//JOptionPane.showMessageDialog(null,"Carro Desligado!!");
		}

		else
		{
			System.out.println("O Carro não está ligado!!");
		}
	}

	public void trocarmarcha()
	{
		this.marcha = this.marcha + 1;
	}

	public void acelerar(int velocidade)
	{
		if (this.ligado == true)
		{
			if (this.freio == false) 
			{
				if (this.marcha == 0) 
				{
					System.out.println("O Carro está em ponto morto!!\n");
				}

				else if (this.marcha == 1) 
				{
					if (velocidade < 30) 
					{
						this.velocidade = velocidade;
						System.out.println(this.velocidade);
					}
				}

				else if (this.marcha == 2) 
				{
					if (velocidade < 50) 
					{
						this.velocidade = velocidade;
						System.out.println(this.velocidade);
					}
				}

				else if (this.marcha == 3) 
				{
					if (velocidade < 80) 
					{
						this.velocidade = velocidade;
						System.out.println(this.velocidade);
					}
				}	
			}
		}
	}

	//metodo de limpar tela do cmd
	public static void cls()
    {
        try
        {

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }

        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}