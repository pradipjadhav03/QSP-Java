import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];

		for (int i=0;i < arr.length ;i++ )
		{
			arr[i] = sc.nextInt();

		}
		for (int j =arr.length-1;j>=0 ;j-- )
		{
			System.out.println(arr[j]);
		}

	}
}
