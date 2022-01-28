package array_operations;

import java.util.*;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		
		int[] reverse = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("Regular array : " + Arrays.toString(reverse));
		
		reversed(reverse);
		
		System.out.println("Regular array : " + Arrays.toString(reverse));
		
	}

	public static void reversed(int[] array) {
		
		int maxLength = array.length - 1;
		int halfLength = array.length / 2;
			for(int i = 0; i < halfLength; i++) {
				int temp = array[i];
				array[i] = array[maxLength-i];
				array[maxLength-i] = temp;		
		}
	}
	
	public static void printArray(int[] reverse) {
		for(int i = 0; i < reverse.length; i++) {
			System.out.println("Reversed :" + reverse + " " + reverse[i]);
		}
	}
}
