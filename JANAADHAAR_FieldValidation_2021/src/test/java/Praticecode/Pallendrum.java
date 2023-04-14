package Praticecode;

import java.util.Scanner;

public class Pallendrum {


		protected void abn() {
		int a;
		int temp1=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
	    a=s.nextInt();
	    int b=a;
	    
	   while(a>0) 
	   {
	    int al=a%10;
	    a=a/10;
	    temp1=temp1*10+al;;
	   
}
	 
	   if(temp1==b)
	   {
		   System.out.print("its a palandrum");
	   }
	   else {
		   System.out.print("its not a palandrum");
	   }

}
	}
