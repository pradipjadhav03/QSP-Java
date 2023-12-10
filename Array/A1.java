import java.util.Scanner;
class A1 
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
		for (int j=0;j < arr.length ;j++ )
		{
			System.out.println(arr[j]);
		}

	/*	arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);  */
	}
}
