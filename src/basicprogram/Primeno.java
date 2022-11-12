package basicprogram;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
	
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0) 
		{
			System.out.println(num+"is a prime");
		}
		else
		{
			System.out.println(num+"not a prime");
		}
		
	
	
	
	
	
	
	}

}
