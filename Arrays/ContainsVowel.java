public class ContainsVowel {

	public static void main(String[] args) {
		
		String str = "violet";
		char[] myArray = new char[7];
		char[] strArray = str.toCharArray();
		
		myArray[0] = 'a';
		myArray[1] = 'b';
		myArray[2] = 'd';
		myArray[3] = 'e';
		myArray[4] = 'i';
		myArray[5] = 'o';
		myArray[6] = 'v';
		
		System.out.println(myArray);
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < myArray.length; j++) {
				if(strArray[i] == myArray[j]) {
					System.out.println("True: " + myArray[j] + " " + j);
				}
			}
		}	
	}
}
