public class Reta
{
	public Ponto a;
	public Ponto b;

	public Reta(float ax, float ay, float bx, float by)
	{
		a = new Ponto(ax, ay);
		b = new Ponto(bx, by);
	}

	public void mostra()
	{
		a.mostra();
		b.mostra();
	}
}