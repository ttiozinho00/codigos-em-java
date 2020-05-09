import java.util.*;

class  Triangle extends TwoDShape 
{
	private double height; 

	double getWidth() 
	{ 
		return width;
	}

	double getHeight()
	{ 
		return height; 
	}

	void setWidth(double w) 
	{ 
		width = w; 
	}

	void setHeight(double h) 
	{ 
		height = h; 
	}

	void showDim() 
	{
		System.out.println("Altura e largura " + width + " e " + height);
	}
}

class Triangle extends TwoDShape 
{
	private String style;

	Triangle(String s, double w, double h) 
	{
		setWidth(w);
		setHeight(h);
		style = s;
	}

	double area() 
	{
		return getWidth() * getHeight() / 2;
	}

	void showStyle() 
	{
		System.out.println("O triangulo e de: " + style);
	}
}	

class Shapes3
{
	public static void main(String[] args)
	{
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		System.out.println("Info for t1: ");

		t1.showStyle();
		t1.showDim();

		System.out.println("Area is " + t1.area());
		System.out.println("");
		System.out.println("Info for t2: ");

		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
	}
}