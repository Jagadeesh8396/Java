package prakash;

public class ReverseString {

	public static void main(String args[])
	{
		String str="my name is nani";
		String reverse="";
		for(int i= str.length()-1;i>=0;i--)
		{
			String rev= reverse+str.charAt(i);
			System.out.println(rev);
			
		}
	}
	
}
