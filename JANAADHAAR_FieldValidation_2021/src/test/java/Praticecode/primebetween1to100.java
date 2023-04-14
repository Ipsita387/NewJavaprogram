package Praticecode;

public class primebetween1to100 {
	public static void main(String[] args)
	{
		int i,j;
	
		for(i=2;i<=100;i++)
		{	int flag=0;
			for (j=2;j<i;j++)
			{
				if(i%j==0)
				{
				flag ++;
				break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
