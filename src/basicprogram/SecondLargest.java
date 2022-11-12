package basicprogram;

public class SecondLargest {
	public static void main(String[] args) {
		int a[]= {0,9,3,4,6,2,1,8};
		int size=a.length;
		int i,j,temp;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println("largest number is="+a[i]);

		}
		System.out.println("second largest number is="+a[size-2]);
		System.out.println("third largest number is="+a[size-3]);

	}
	

}
