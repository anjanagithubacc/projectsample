package Sample;

import java.util.Scanner;

public class Largst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for( i=0;i<5;i++)
{
	a[i]=sc.nextInt();

}
int l=a[0];
for(i=0;i<a.length ;i++)
if(l<a[i])
{
	l=a[i];
}
System.out.println("Largest elements is:"+l);
	}
}


