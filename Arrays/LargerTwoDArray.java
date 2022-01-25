package array_operations;

import java.util.*;

public class LargerTwoDArray {

	public static void main(String[] args) {
		
		//	object scanner
		Scanner s = new Scanner(System.in);
		
		//	declare row, column, and length of 2d-array matrixOne
		int x = s.nextInt();
		int y = s.nextInt();
		int matrixOneSum = 0;
		int matrixOneLength = 0;
		
		//	declare row, column and length of 2d-array matrixTwo
		int a = s.nextInt();
		int b = s.nextInt();
		int matrixTwoSum = 0;
		int matrixTwoLength = 0;
		
		//	create matrixOne and matrixTwo
		int[][] matrixOne = new int[x][y];
		int[][] matrixTwo = new int[a][b];
		
		//	double loop go through row then column for matrixOne
		for(int i = 0; i < matrixOne.length; i++) 
		{
			for(int j = 0; j < matrixOne.length; j++) 
			{
				//	set the matrixOne to take random input size 10, then get the length of the 2d set matrix
				// 	pdf says lengths can be different in a 2d-Array, if the difference is not too large it works
				// if arrays are same size it checks out
				matrixOne[i][j] = (int)(Math.random()*20 + 1);
					matrixOneLength = matrixOne.length;
						System.out.print(matrixOne[i][j] + " ");
			}
			System.out.println();	
		}
		
		System.out.println();
		
		//	double loop through rown then column for matrixTwo
		for(int i = 0; i < matrixTwo.length; i++) 
		{
			for(int j = 0; j < matrixTwo.length; j++) 
			{	
				// set the matrixTwo to take random input size 10, then get the length of the 2d set matrix
				matrixTwo[i][j] = (int)(Math.random()*20 + 1);
					matrixTwoLength = matrixTwo.length;
						System.out.print(matrixTwo[i][j] + " ");
			}
			System.out.println();	
		}
		
		//	double for loop to attain matrixSumOne by adding iterations 
		for(int i = 0; i < matrixOne.length; i++) 
		{
			for(int j = 0; j < matrixOne.length; j++)
			{
				matrixOneSum += matrixOne[i][j];
			}	
		}
		
		System.out.println();
		
		//	double for loop to attain matrixSumTwo by adding iterations 
		for(int i = 0; i < matrixTwo.length; i++) 
		{
			for(int j = 0; j < matrixTwo.length; j ++) 
			{
				matrixTwoSum += matrixTwo[i][j];	
			}
		}
		
		// get indexes
		int indexOfMatrixOne = matrixOne.length;
		int indexOfMatrixTwo = matrixTwo.length;
		
		//	print tests 
		System.out.println("The index of matrixOne is : " + indexOfMatrixOne);
		System.out.println("The length of matrixOne is : " + matrixOneLength);
		System.out.println("The sum of matrixOne is : " + matrixOneSum);
		System.out.println();
		System.out.println();
		System.out.println("The index of matrixOne is : " + indexOfMatrixTwo);
		System.out.println("The length of matrixOne is : " + matrixTwoLength);
		System.out.println("The sum of matrixOne is : " + matrixTwoSum);
		System.out.println();
		System.out.println();
		
		//	if statement to check which sum of the 2d arrays is larger
		if(matrixOneSum > matrixTwoSum)
		{
			System.out.println("The sum of matrixOne is larger than the sum of matrixTwo");
		}
		else
		{
			System.out.println("The sum of matrixTwo is larger than the sum of matrixOne");
		}
		s.close();
	}
}










