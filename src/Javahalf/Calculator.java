package Javahalf;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char c;
System.out.println("Enter the two numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	do
	{
	System.out.println("Enter the choice\n1..Addition\n2...Substraction\n3...Mutiplication\n4....Division\n");
	int ch=sc.nextInt();

	
	switch(ch)
	{
	case 1:
			System.out.println("Addition="+(a+b));
			break;
	case 2:
		System.out.println("Substraction="+(a-b));
		break;
	case 3:
		System.out.println("Multiplication="+(a*b));
		break;
	case 4:
		System.out.println("Division="+(a/b));
		break;
		default:
			System.out.println("Invalid choice");
			
	}
	System.out.println("Do you want to continue");
	 c=sc.next().charAt(0);
	}while(c=='y');
	}
}
