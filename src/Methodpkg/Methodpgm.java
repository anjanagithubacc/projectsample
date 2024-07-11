package Methodpkg;

public class Methodpgm {
//method without parameter and without return type
		public void add()
		{
			int a=10,b=30,c;
			 c=a+b;
			 System.out.println("Add"+c);		
		}
		//method with parameter and without return type
		public void sub(int a,int b)
		{
			int c=a-b;
			System.out.println("Substraction"+c);
		}
		//method without parameter with return type
		public int mul()
		{
			int a=5,b=2;
			int c=a*b;
			return c;
		}
//method with parameter and with return type
		public double div(int a,int b)
		{
			double c=a/b;
			return c;
		}
		public static void main(String[] args) {
			Methodpgm m=new Methodpgm();
			m.add();
			m.sub(30, 10);
			int d=m.mul();
			System.out.println("Multiplication"+d);
			double s=m.div(40, 2);
			System.out.println("Divison:"+s);
			}
}
