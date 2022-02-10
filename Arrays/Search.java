package searches;

public class Search {

	public static void main(String[] args) {
		
		int[] numbers = {1, 10, 13, 16, 19, 24};
		int[] number = {1, 2, 3, 4, 5};
		
		Search search = new Search();
		
		System.out.println(search.findIndex(numbers, 1));
		System.out.println(search.getIndexRecursively(numbers, 13, 2));
		System.out.println(search.getIndex(number, 5, 0, number.length - 1));
		System.out.println(search.getIndex(number, 5, 0, number.length - 1));
	}
	
	public int findIndex(int[] array, int index) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == index) {
				return i;
			}
		}
		return -1;
	}
	
	public int getIndexRecursively(int[] array, int item, int index) {
		if(index >= array.length) {
			System.out.println();
			// test to see what is happeneing in here just incase
			System.out.println("Index is : " + index + " Array length is : " + array.length);
			return -1;
		}
		if(array[index] == item) {
			return index;
		}
		return getIndexRecursively(array, item, index + 1);
	}
	
	// order of variables in method header matters
	// other wise recursive call does not contain
	// variables it should mixing left with right and item etc
	public int getIndex(int[] array, int item, int left, int right) {
		if(right < left) {
			return -1;
		}
		int middleIndex = (left + right) / (2);
		if(array[middleIndex] == item) {
			return middleIndex;
		}
		if (array[middleIndex] < item) {
			return getIndex(array, item, middleIndex + 1, right);
		} else {
			return getIndex(array, item, left, middleIndex - 1);
		}	
	}
}
