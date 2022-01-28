package array_operations;

import java.util.*;

public class AddTwoTwoDArrays {		

		public static void main(String[] args) {
			
			//	object scanner
			Scanner s = new Scanner(System.in);
			
			//	declare row, column, and length of 2d-array matrixOne
			int x = s.nextInt();
			int y = s.nextInt();
			int matrixTwoLength = 0;
			
			//	declare row, column and length of 2d-array matrixTwo
			int a = s.nextInt();
			int b = s.nextInt();
			int matrixOneLength = 0;
			
			//	create matrixOne and matrixTwo
			int[][] matrixOne = new int[x][y];
			int[][] matrixTwo = new int[a][b];
			
			System.out.println("Please enter a value under 20, and 2 inputs for for row and column of array");
			System.out.println("Make sure both arrays have same amount of row and colums");
			System.out.println();
			System.out.println();
			
			//	double loop go through row then column for matrixOne
			for(int i = 0; i < matrixOne.length; i++) 
			{
				for(int j = 0; j < matrixOne.length; j++) 
				{
					//	set the matrixOne to take random input size 10, then get the length of the 2d set matrix
					// 	pdf says lengths can be different in a 2d-Array, if the difference is not too large it works
					// if arrays are same size it checks out
					matrixOne[i][j] = (int)(Math.random()*20 + 1);
							System.out.print(matrixOne[i][j] + " ");
							matrixOneLength = matrixOne.length;
				}
				System.out.println();	
			}
			//	print test for matrixOne length
			System.out.println();
			System.out.println("The length of matrixOne is : " + matrixOneLength);
			
			System.out.println();
			System.out.println();
			
			//	double loop through rown then column for matrixTwo
			for(int i = 0; i < matrixTwo.length; i++) 
			{
				for(int j = 0; j < matrixTwo.length; j++) 
				{	
					// set the matrixTwo to take random input size 10, then get the length of the 2d set matrix
					matrixTwo[i][j] = (int)(Math.random()*20 + 1);
							System.out.print(matrixTwo[i][j] + " ");
							matrixTwoLength = matrixTwo.length;
				}
				System.out.println();	
			}
			
			//	print test for matrixTwo length
			System.out.println();
			System.out.println("The length of matrixTwo is : " + matrixTwoLength);	
			
			System.out.println();
			System.out.println();
			
			// earlier i tried to create added-2d-matrix but does not behave like matrixOne matrixTwo
			//int addedMatrix1[][] = new int[matrixOneLength][matrixTwoLength];
			
			// loop through matrixOne and MatrixTwo using their lengths 
			// using matrixOnes 2 separates arrays as once as for matrixTwo /*considering input is the same*/
			for(int i = 0; i < matrixOneLength; i++) 
			{
				for(int j = 0; j < matrixTwoLength; j++) 
				{
					int addedMatrix = matrixOne[i][j] + matrixTwo[i][j];
					// print test checks out
					System.out.println(addedMatrix);
				}
			}
			
			// also why was i able to create matrixOne and MatrixTwo and use them out side their function scopes
			// close scanner to avoid memory leaks
			// for small inputs number works
			s.close();
	}
}






















