package Praticecode;

public class ReverseString {

	public static void main(String[] args) {
		String s="Ipsita";
		String y="";
		int x=s.length();
		for(int i=x-1;i>=0;i--)
		{
			y=y+s.charAt(i);
		}
		// TODO Auto-generated method stub
System.out.print(y);
	}

}
