package defaultPackage;

import java.util.Scanner;

public class Retirement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retire?");
		double goal = in.nextDouble();

		System.out.print("How much money will you contribute each year?");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		// update account balance while goal isn't reached
		while (balance < goal)
		{
			// add this year's payment and interest
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			System.out.printf("Interest: %8.2f. Balance: %8.2f. \n", interest, balance);
			years++;
		}
		
		System.out.println("You can retire in " + years + " years.");
		in.close();
	}

}
