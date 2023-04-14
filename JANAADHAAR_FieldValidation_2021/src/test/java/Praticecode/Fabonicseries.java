package Praticecode;

public class Fabonicseries {
	public void    fabonicseries()
	{
		int a=0;
		int b=1;
		int c;
		System.out.print(a + " "+ b);
		int i=2;
		while(i<=10)
		{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
			i++;
		}
	}

}
