package array_operations;

import java.util.*;

public class DescendingArray {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] ints = getIntegers(10);
		int[] sort = sort(ints);
		printArray(sort);
		
	}	
	
	public static int[] getIntegers(int array) {
		System.out.println("Enter " + array + " Integer values.\r");
		int[] myIntegers = new int[array];
		for(int i = 0; i < 10; i++) {
			myIntegers[i] = scanner.nextInt();
		}
		return myIntegers;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Sorted in descending order : " + array[i]);
		}
	}
	
	public static int[] sort(int[] decreasing) {
		int[] sortedArray = new int[decreasing.length];
		for(int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = decreasing[i];
		}
			boolean flag = true;
			int temp = 0;
			while(flag) {
				flag = false;
				for(int i = 0; i < sortedArray.length-1; i++) {
					if(sortedArray[i] < sortedArray[i+1]) {
						temp = sortedArray[i];
						sortedArray[i] = sortedArray[i+1];
						sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}	
}