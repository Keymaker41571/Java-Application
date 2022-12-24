public class LambaExpressionOne {
	
	public static void main(String[] args) {
		
		School school = (sam, samgmail) -> {
			System.out.println("Name: " + konrad + " & Email: " + samgmail);
			return "hi der";			
		};
		System.out.println(school.bookAppointment("sam", "sam"));
		School.print();
		School.show();
		School.add(5, 2);		
	}

@FunctionalInterface
interface School {	
	public String bookAppointment(String sam, String samgmail);
	
	public static void print() {
		System.out.println("Hey im being called from Functional interface school - via static method");
	}
	
	static void show() {
		System.out.println("Hey im being called from Functional interface school - via default method method");
	}
	
	public static void add(int x, int y) {
		int sum = x + y;
		System.out.println("Simple add method from Functional interface, Sum is: " + sum);
	}	
}
}

/* This class show how to use a functional interface on a very basic level
 * Step 1: create an interface using the @FunctionalInterface notation
 * Step 2: define its parameters, it has no implementation because it is an abstract method (can only have 1)
 * Step 3: Create an object of functional interface class and pass parameters in that object
 * Step 4: Create a Lamba function to call the the object of the functional interface, look up syntax
 * Note: Lamba functions may or may not have return type, have a declaration, and no access modifier, using lamba () -> { };
 */
