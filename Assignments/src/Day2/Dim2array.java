package Day2;

public class Dim2array {
		public static void main(String[] args) {
		//System.out.println("hi");	
		int[][] arr = new int[13][13];
		for(int i = 0; i <= 12 ; i++)
		{
			for(int j = 0 ; j <= 12 ; j++ )
			{
					
			if(i == 0 && j == 0){
					arr[i][j] = 0;
				}
				else if(i == 0 && j != 0)
				{
					arr[i][j] = j;
				}
				else if(i != 0 && j == 0)
				{
					arr[i][j] = i;
				}
				else
				{	
					arr[i][j] = i * j;
				}
			}
		}
		for(int i = 0 ; i <= 12; i++ )
		{
			for(int j = 0; j <= 12 ; j++ )
			{
				if(i == 0 && j == 0){
					System.out.print("  ");
				}
				else
				{
					System.out.print(arr[i][j] + "  ");
			
				}
			}
			System.out.println();
		}
	
		}

}

