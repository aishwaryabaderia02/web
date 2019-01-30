package Nugget2;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		
	
		char[][] c = new char[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 3; i++ ){
			for(int j = 0; j< 3 ; j++)
			{
				c[i][j] = sc.next().charAt(0);
			}
		}
		System.out.println(winner(c));
	}
		public static String winner(char[][] c)
		{
			int i = 0 , j = 0;
			if((c[i][j] == c[i+1][j+1]) && (c[i+1][j+1] == c[i+2][j+2])) 
			{
				return c[i][j] + " Wins";
			}
			else if((c[i][j] == c[i][j+1])&&(c[i][j+1] == c[i][j+2]))
			{
				return c[i][j] + " Wins";
			}
			else if((c[i][j] == c[i+1][j])&&(c[i+1][j] == c[i+2][j]))
			{
				return c[i][j] + " Wins";
			}
			else if((c[i][j+2] == c[i+1][j+2])&&(c[i+1][j+2] == c[i+2][j+2]))
			{
				return c[i][j+2] + " Wins";
			}
			else if((c[i+2][j] == c[i+2][j+1])&&(c[i+2][j+1] == c[i+2][j+2]))
			{
				return c[i+2][j] + " Wins";
			}
			else if((c[i][j+2] == c[i+1][j+1])&&(c[i+1][j+1] == c[i+2][j]))
			{
				return c[i][j+2] + " Wins";
			}
			else
			{
				return "draw match";
			}
			
						
		}
	
}
