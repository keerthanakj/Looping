package statements;

public class PrintEvenNum {
	public static void main(String[] args) {
		int i;
		i=1;
		System.out.println("Even numbers from 1 to 100");
		while(i<=100)
		{
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
}
