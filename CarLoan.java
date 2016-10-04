/*******************************************************************************************************************
 * (Ask the user to input):
 * Their first and last name (as one String - use nextLine)
 * The cost of the car
 * The down payment 
 * The number of years the car is being financed 
 * The annual interest rate
 * Monthly payment = (monthly interest rate) (financed amount) / 1 - (1 + monthly interest rate)^-number of months
 * (Output)
 * The monthly payment formatted as money
 * An account number that you generate by combining the first letter of the user's last name with a random number 
 * ... between 1000 and 10000. One letter followed by exactly 5 digits. Use DecimalFormat.
 ********************************************************************************************************************/

import java.util.*;
public class CarLoan {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Variables		
		double CarCost;
		double DownPayment;
		int    NumberOfYears;
		double AnnualInterestRate;
		double MonthlyPayment;
		double NumberOfMonths;
		
		// Input 
		System.out.print("Enter your first and last name");
		String sentence = reader.nextLine();
		
		System.out.println("Enter the cost of the car: ");
		CarCost = reader.nextDouble();
		
		System.out.println("Enter your down payment amount: ");
		DownPayment = reader.nextDouble();
		
		System.out.println("Enter the number of years the car is being financed: ");
		NumberOfYears = reader.nextInt();
		
		System.out.println("Enter the annual interest rate; Example: 5.0 % must be entered as 7.2. ");
		AnnualInterestRate = reader.nextDouble();
		
		// Math operation(s)
		NumberOfMonths = AnnualInterestRate/12;
		MonthlyPayment = (AnnualInterestRate) * (NumberOfYears) / 1 - ( Math.pow(1 + AnnualInterestRate, - NumberOfMonths);
		
		// Output
		System.out.println("The monthly amount due is: " + MonthlyPayment);
		Random AccountNumber = new Random();
		int    number;
		
		for (int counter = 1000; counter <= 10000;) {
		

	}

}
