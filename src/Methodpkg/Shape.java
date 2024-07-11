package Methodpkg;

public class Shape {
	public void rect()
	{
		int l=20,b=10;
		int area=l*b;
		System.out.println("Area:"+area);
	}
	public double circle()
	{
		int r=4;
		double area=3.14*r*r;
		return area;
	}
	public int Square(int a)
	{
		int area=a*a;
		return area;
	}
	public void Triangle(int b,int h)
	{
		double area=(.5*b*h);
		System.out.println("Triangle area:"+area);
	}
public static void main(String[] args) {
	Shape s=new Shape();
	s.rect();
	double c=s.circle();
	System.out.println("Circle area:"+c);
	int ar=s.Square(5);
	System.out.println("Square area:"+ar);
	s.Triangle(4, 8);
		}
}
