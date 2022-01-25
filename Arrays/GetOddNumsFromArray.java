package array_operations;

import java.util.Scanner;

public class GetOddNumsFromArray {

	public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
        int numbers = 0;
      
        //	get inpputs and create array
        System.out.print("Please input elements in array : ");
        numbers = (int)(Math.random()*20 +1);
        int[] myArray = new int[numbers];
       
        //	adding input user values to array
        for(int i = 0; i < numbers; i++) 
        {
            myArray[i] = s.nextInt();
        }
        
        // print odd numbers
        System.out.print("Odd numbers : ");
        for(int a = 0 ; a < numbers ; a++)
        {
            if(myArray[a] % 2 != 0)
            {
                System.out.print(myArray[a] + " ");
            }
        }
        s.close();
    }
}
