package Recursion_One;

public class RecursionOne {

	// sum of digits 123, 1 + 2 + 3 = 6
	public int SumDigits(int x) {
		if(x == 0 || x < 0) return 0;	
			return x%10 + SumDigits(x/10);
	}

	
	// power
	public int power(int x, int y) {
		if(y == 0) return 1;
			return x * power(x, y -1);
	}  
	

	// gcd
	public int gcd(int x, int y) {
		if(x < 0 || y < 0) return -1;
		if(y == 0) return y;
			return gcd(y, x%y);
	}
	

	// recursive method
	public int decToBin(int x) {
		if(x == 0) return 0;
		if(x < 0) return -1;
			return x%2 + decToBin(x/2);
	}
	

	// method takes 2 parameters base and exponent 
	public static int mathPower(int base, int exp) {
		
	  if(exp == 0)  return 1;
		return base * mathPower(base, exp-1);    
	}
	

	// iterative methods which is faster
	public int myFibonacci(int n) {
		if(n < 0) {
			return -1;
		}
		if(n == 0 || n == 1) {
			return n;
		}
		
		int a = 0;
		int b = 1;
		int sum = a + b;
		
			while(n > 1) {
				sum = a + b;
				a = b;
				b = sum;
				// decrements to one which is why it shows 1 in terminal when ran
				System.out.println(sum);	
				n--;
			}
		return n;
	}
	
	
	// recursive method which is slower uses stack calls
	public int iterativeFibonacci(int x) {
		if(x < 0) {
			return -1;
		}
		if(x == 1 || x == 0)
			return x;
		return iterativeFibonacci(x-1) + iterativeFibonacci(x-2);
	}
	
	
	// product of an array
	public int productOfArray(int A[], int n) {
		if(n <= 0) return 1;
			return (productOfArray(A, n-1)*A[n-1]);
	}
	
	
	// recursive range
	public int recursiveRange(int num) {
		if (num <= 0) {
		return 0;
     }
     return num + recursiveRange(num - 1);
   } 
	

	// method for factorial
	public int factorial(int num) {
	    if(num <= 1) return 1;
	    	return num * factorial(num-1);
	  }
}

