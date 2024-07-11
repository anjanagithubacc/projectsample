package INTERFACE;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
boolean flag=false;
for(int i=2;i<=a/2;i++)

{
	if(a%2==0)
	{
		flag=true;
		break;
	}
		
}
if(!flag)
{
	System.out.println("Prime");
}
else
{
	System.out.println("Not prime");
}
	}

}
