package predicates;

import java.util.function.Predicate;

// predicate takes in one parameter and returns a boolean
// use only if you have conditional check in your program

public class PredicateOne {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = i -> (i>10);
		System.out.println("Is the integer 20 greater than 10? : " + predicate.test(20));
		System.out.println("Is the integer 5 greater than 4? : " + predicate.test(5));
		
		System.out.println();
		
		Predicate<String> s = str -> (str.length() > 4);
		System.out.println("Is the string Kennedy greater than 4? : " + s.test("Kennedy"));
		System.out.println("Is the string xyz greater than 4? : " + s.test("xyz"));
		
		System.out.println();
		
		String names[] = {"David", "Scott", "Smith", "John", "Mary"};
		
		for(String name:names) {
			if(s.test(name)) {	
				System.out.println("These names all have greater than 4 characters in the array : " + name);
			}
		}	
	}
}
