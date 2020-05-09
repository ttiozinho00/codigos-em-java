import java.util.Scanner;
import java.util.*;

public class Sphere
{
	public void determineSphereVolume()
	{
		Scanner leitura = new Scanner(System.in);
		double radius;

		System.out.print("Informe o raio da esfera: ");
		radius = leitura.nextInt();

		System.out.printf("O volume é de: %f\n",sphereVolume(radius));
	}

	public double sphereVolume(double radius)
	{
		double volume;
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
}