import java.util.Scanner;
class P2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		int end = arr.length-1;
		for (int start=0 ;start<end ;start++ )
		{
			arr[start] = arr[start] + arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
		}
		for (int j =0;j<arr.length ;j++ )
		{
			System.out.println(arr[j]);
		}


	}
}
