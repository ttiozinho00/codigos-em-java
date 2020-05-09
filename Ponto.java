public class Ponto
{
	public float x;
	public float y;

	public Ponto(float ax, float ay)
	{
		this.x = ax;
		this.y = ay; 
	}

	public void move(float dx,float dy)
	{
		this.x += dx;
		this.y += dy;
	}

	public void mostra()
	{
		System.out.println("(" + this.x + "," + this.y + ")");
	}		
}