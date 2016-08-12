import java.util.Scanner;
public class MaximumSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int temp;
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The elements are");
for(int i=0;i<3;i++)
{
	System.out.println(a[i]);
	sum=sum+a[i];
}
System.out.println("The answer is "+sum);
	}

}
