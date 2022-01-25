package array_operations;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		
		//	scanner object and declare sum
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		//	declare input x and y and create 2d array set variable for loops
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[][] matrix = new int[x][y];
		int i,j;
		
		//	double for loop row column to get int
		//	set double matrix to random input 1 to 20 values
		//	then print to check
		
		System.out.println("Please enter a value under 20, and 2 inputs for for row and column of array");
		System.out.println("Make sure they are the same value for row and column");
		System.out.println();
		System.out.println();
		
		for(i = 0; i < matrix.length; i++) 
		{
			for(j = 0; j < matrix.length; j++) 
			{
				matrix[i][j] = (int)(Math.random()*20 + 1);
						System.out.print(matrix[i][j] + " ");
			}
			System.out.println();	
		}
		
		// use double loop to iterate to add the values in matrix
		// to sum incrementally going through the matrix via these
		// loops in here
		for(i = 0; i < matrix.length; i++) 
		{
			for(j = 0; j < matrix.length; j++) 
			{
				sum += matrix[i][j];
			}
		}
		
		// length of matrix's index and get average
		int indexOfMatrix = matrix.length;
		double average = (sum/indexOfMatrix);
		
		// print test cases with a
		System.out.println();
		System.out.println();
		System.out.println("The sum of the two dimensional matrix is :" + sum);
		System.out.println("The index of the matrix is : " + indexOfMatrix);
		System.out.printf("The average of the matrix is : " + "average = %.2f", average);		
	}
}
