package basicprogram;

import java.util.Scanner;

public class Dollartorupee {
	public static void main(String[] args) {
		System.out.println("enter the rupees we will convert into dollar");
		Scanner sc=new Scanner(System.in);
		int rupee=sc.nextInt();
		double dollar=rupee*80.55;
		System.out.println("conversion rupee int dollar"+dollar);
		System.out.println("enter dollar we will convert into rupees");
		double dollarcurr=sc.nextDouble();
		double inr=dollarcurr/80.55;
		System.out.println("conversion rupee int dollar"+inr);
	}

}
