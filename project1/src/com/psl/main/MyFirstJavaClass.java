package com.psl.main;
import java.util.Scanner;

public class MyFirstJavaClass {

	private int i = 76;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
	
		MyFirstJavaClass m = new MyFirstJavaClass();
		
		System.out.println(m.getI());
		m.setI(4);
		System.out.println(m.getI());
		
		/*byte bytval;
	bytval = 0b1010;
	bytval = (byte)(bytval * 10);
	float p = 111.3f;
	outerloop: while(bytval > 0)
	{
		for(;;)
		{
			if(bvtval < 0b0010)
			{
				continue outerloop; 
			}
			break outerloop;
		}
		
	}
	
	
	
	//vararg
	public static void method(String msg, int ...vals)
	{
		for(int v : vals){
			}
		}
	}
	
	
	/*int marks[] = new int[3];
	char matrix[][] = new char[5][10];
	int x = 0, y = 0;
	while(x <matrix.length)
	{
		y = 0;
		while( y < matrix[x].length)
		{
			System.out.println(matrix[x][y]);
			y++;
		}
		x++;
	}
	for(char arr[] : matrix){
		for(char c : arr)
		{
			System.out.println(matrix[x][y]);
		}
	}
	char matrix[][] = new matrix[5][];
	for(int index = 0;index < matrix.length ; index++)
	{
		matrix[index] = new char[(index+1)*5];
	}*/
	}
}

