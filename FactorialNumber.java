package statements;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		long fact = 1;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		
		
		while(num>=1)
		{
			fact= fact * num;
			num--;
		}
		System.out.println("Factorial is "+fact);
	}

}
