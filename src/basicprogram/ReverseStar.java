package basicprogram;

public class ReverseStar {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++) //increment 1 to i
			{
				System.out.print(" "); //print use only
			}
			for(int k=i;k<=10;k++)
			{
				System.out.print("*");
			}
			for(int l=i;l<10;l++) //decrement i to 10
			{
				System.out.print("*");
			}
			
			System.out.println();

}
}
}