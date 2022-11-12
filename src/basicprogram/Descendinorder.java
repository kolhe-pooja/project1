package basicprogram;

public class Descendinorder {
	public static void main(String[] args) {
	int a[]= {0,2,44,99,222,66,999};
	//int size=a.length;
	int i,j,temp;
	System.out.println("sorted array is in descending order");
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);

	}

	}
}
