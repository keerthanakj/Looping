package statements;

import java.util.Scanner;

public class armstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number,originalNumber, rem, result = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number:");
		 number = sc.nextInt();
		 
	     originalNumber = number;

	        while (originalNumber != 0)
	        {
	            rem = originalNumber % 10;
	            result += Math.pow(rem, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	}

}
