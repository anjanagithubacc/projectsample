package SAMPLE2;

import java.util.Scanner;

public class Countpnz {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int i,p=0,n=0,z=0;
int a[]=new int[5];
System.out.println("Enter the number");
for(i=0;i<5;i++)
{
	a[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
	if(a[i]==0)
	{
		z++;
	}
	else if(a[i]>0)
	{
		p++;
	}
	else
	{
		n++;
	}
}
System.out.println("no: of Negative numbers"+n);
System.out.println("No: of Postive numbers"+p);
System.out.println("No:of zero's numbers"+z);

	}

}
