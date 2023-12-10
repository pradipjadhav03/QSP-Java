import java.util.Scanner;
class IndexPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for (int i=0;i<arr.length ;i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int j=0;j<arr.length ;j++ )
		{
			if (arr[j]%2!=0)
			{
				System.out.println(arr[j]);
			}
			
		}

	}
}
