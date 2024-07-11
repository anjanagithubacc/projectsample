package Sample;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testing Training center";
		String s1[]=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		}

}
