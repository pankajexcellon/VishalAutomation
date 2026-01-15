package auto_bajaj_001_company;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
//		int num = 5;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Factorial number : ");
        int Scanner = sc.nextInt();
		long fact = 1;
		
		for(int i=1; i<=Scanner; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of number is "+fact);

	}

}
