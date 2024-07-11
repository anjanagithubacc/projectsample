package Exam;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int [5];
		int i;
		System.out.println("Enter the elements");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The duplicate elements");
		for (i = 0; i < 5; i++) 
		{
	            int c = 0;
	            for (int j = i + 1; j < 5; j++)
	            { 
	                if (a[i] == a[j])
	                {
	                    c++;
	                }
	            }
	            if (c > 0) 
	            { 
	                System.out.println(  a[i]);
	            }
	        }

}
}
