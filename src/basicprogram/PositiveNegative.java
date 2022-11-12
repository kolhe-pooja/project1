package basicprogram;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter the number");
	int num=s.nextInt();
	if(num>0)
	{
		System.out.println(num+" number is positive");
	}
	else 
		if(num<0)
	{
		System.out.println(num+" number is negative");
	}
		else
		{
			System.out.println(num+" number is zero0");
		}
}

}
