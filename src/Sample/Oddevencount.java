package Sample;

import java.util.Scanner;

public class Oddevencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int b=sc.nextInt();
int a[]=new int[b];
int od=0,oe=0,i;

System.out.println("Enter the elements");
for(i=0;i<b;i++)
{
	a[i]=sc.nextInt();
	if(a[i]%2==0)
	{
		oe++;
	}
	else
	{
		od++;
	}
}



System.out.println("Total number of even number is:"+oe);
System.out.println("Total number of odd number is:"+od);

	}

}
