package basicprogram;

public class Completediamond {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int j=i;j<=10;j++)
			{
				System.out.print(" ");
			}
		
		for(int k=1;k<i;k++) //don't give = sign
		{
			System.out.print("*");
		}
		for(int l=1;l<=i;l++)
		{
			System.out.print("*");
		}
		System.out.println();
	} 
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
			for(int l=i;l<10;l++) //decrement i to 10  //don't give = sign
			{
				System.out.print("*");
			}
			
			System.out.println();

}
	}
}
