package Praticecode;

import java.util.ArrayList;

public class Arrayincollection {
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		ArrayList<String> k=new ArrayList<String>();
		for(int i=0;i<=10;i++)
		{
		a.add(i,"Name" + i);
	
	}
		a.remove(1);
		
	System.out.print(a);	
	}

}
