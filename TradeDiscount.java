package lab1;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
// Programmer: Mike Mordec

public class TradeDiscount {
	public static void main(String[] args) 
	{
		System.out.println("Enter name");
		Scanner scanner = new Scanner(System.in);
		String user = scanner.next();
		System.out.println("Enter List Price");
		double price = scanner.nextDouble();
		System.out.println("Enter trade discount rate");
		double discountRate = scanner.nextDouble();
		double tradeDiscount = price * discountRate;
		double netAmount = price - tradeDiscount;
		// declare an object that will display two decimal digits
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// declare an object that will display the current date
		Date myDate = new Date();
		String myDateFormat = "MM/dd/yyyy";
		SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
		System.out.println("Today's Date is: " + dtToday.format(myDate));
		// display the name of the programmer
		System.out.println(" Programmer: " + " Mike Mordec ");
		// display a test value to show that two decimals are obtained
		System.out.println("Net amount: " + nf.format(netAmount));
		Calendar validUntill = Calendar.getInstance();
		validUntill.add(Calendar.DATE,7);
		Date validUntillDate = validUntill.getTime();
		System.out.println("Valid Untill: " + dtToday.format(validUntillDate));


		scanner.close();
	}
}