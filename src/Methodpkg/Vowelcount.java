package Methodpkg;

import java.util.Scanner;

public class Vowelcount {
	public static int  vowel(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='e'||s.charAt(i)=='u')
			{
				c++;
			}
			
		}
		return c;
	
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=vowel(s);
		System.out.println(c);
	
		

	}

}
