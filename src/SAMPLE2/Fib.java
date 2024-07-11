package SAMPLE2;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int a=sc.nextInt();
		int x=0;
		int y=1;
		System.out.println("Fibannocai");
		System.out.println(x);
		System.out.println(y);
		for(int i=2;i<=a;i++)
		{
			int z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
		

	}

}
