package Exam;

public class Three {

	public static void main(String[] args) {
		
String s="Hello";
String rev="";
int l=s.length()-1;
for(int i=l;i>=0;--i)
{
	rev=rev+s.charAt(i);
}
System.out.println("Reverse of string:"+rev);
	}

}
