package statements;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number");
			num = sc.nextInt();

			int rev = 0;
			while(num!=0) {
				int rem = num%10;
				rev = rev*10+rem;
				num = num/10;
			}
			System.out.println("The Reverse of "+num+" is "+rev);
		}
}


