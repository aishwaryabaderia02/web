package Day2;

public class Lsearch {
	public static int[] lsort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n-1 ; i++)
		{
			for( int j = 0 ; j <= i  ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public static void lsearch(int arr[], int k)
	{
		for(int i = 0; i < arr.length ; i++ )
		{
			if(arr[i] == k)
			{
				System.out.println("found at position " + i+1);
			}
		}
	}
}
