package SAMPLE2;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int a=sc.nextInt();
		int i;
		System.out.println("Enter the numbers");
		int[] m=new int[a];
		for(i=0;i<a;i++) 
		{
			m[i]=sc.nextInt();
			
		}
		int l =m [0];
		for(i=0;i<a;i++) 
		{
			if(l<m[i])
			{
				l=m[i];
				
			}
		  }
		System.out.println("Largest elements is:"+l);
		}

}
//repeat charcters in a string