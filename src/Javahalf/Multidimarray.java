package Javahalf;

import java.util.Scanner;

public class Multidimarray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the matrix size:");
	int n=sc.nextInt();
	int m=sc.nextInt();
	int k[][]=new int[n][m];
	System.out.println("Enter the matrix elements");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			k[i][j]=sc.nextInt();
		}
	}
System.out.println("The matrix is:");
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		System.out.print(k[i][j]+" ");
	}
	System.out.println();
}
	}

}
