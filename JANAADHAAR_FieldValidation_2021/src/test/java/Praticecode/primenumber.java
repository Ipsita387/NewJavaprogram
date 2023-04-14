package Praticecode;

 public class primenumber {
	public static void main(String args[])
	{
		int i;
		int num=89;
		int flag=0;
		int m;
		if(num==0|num==1)
		{
			System.out.print("This is not a prime number ");
		}
		else
		{
			for(i=2;i<num;i++)
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("This is  a prime number ");	
		}
		else {
			System.out.print("This is not a prime number ");
		}
	}
}


 