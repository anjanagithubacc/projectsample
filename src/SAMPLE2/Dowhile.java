package SAMPLE2;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
String resp;
do
{
	System.out.println("Enter the two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("Sum:"+c);
	System.out.println("Do you want to continue");
	 resp = sc.next(); 

} while (resp.equals("y"));
	}

}
