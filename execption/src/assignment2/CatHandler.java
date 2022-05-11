package assignment2;

import java.util.Scanner;


/**
 * Assignment2 Part 1, it includes three inner exception classes which related by inheritance to one another.
 * @author Lin Wang
 *
 */
public class CatHandler {

	/**
	 * this main method using try catch format to to check a the cat number in a shelter
	 * and catch the corresponding exceptions.
	 * In the try block, it check the input number, according the input number to throw different
	 * exception.
	 *  ExceptiAlpha: if cat number is larger or equal to 50, throw ExceptionAlpha
	 *  ExceptionBeat: if cat number is larger than 0 and smaller than 5, throw ExceptionBeat
	 *  ExceptionGammer, if cat number is smaller or equal to  0, throw ExceptionGammer
	 *  In catch block, capture the exception type and print the exceptions message
	 * @param args null
	 */


	public static void  main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			CatHandler handler = new CatHandler();
			System.out.println("Pleas input a number:");
			int number = input.nextInt();
			System.out.println("-------Part 1, CatHandler Test--------");
			if (number  >= 5) {
				throw handler.new ExceptionGammer();
			}else 
				if (number >0 && number <5 ) {
					throw handler. new ExceptionBeta();
				}
				else if (number  <= 0) {
					throw handler.new ExceptionAlpha();
				}
		}

		catch (ExceptionAlpha e) {  //this exception is polymorphisim
			e.printStackTrace();
		}
	}
	/**
	 *  Exception Class ExceptionAlpha, an inner class,extends Exception
	 * @author Lin Wang
	 *
	 */
	public class ExceptionAlpha extends Exception {
	

	}
	/**
	 *  Exception Class ExceptionBeta, an inner class,extends ExceptionAlpha
	 * @author Lin Wang
	 *
	 */
	public class ExceptionBeta extends ExceptionAlpha{
	
	}
	/**
	 *  Exception Class ExceptionGammer, an inner class,extends ExceptionBeta
	 * @author Lin Wang
	 *
	 */
	public class ExceptionGammer extends ExceptionBeta{
	
	}
	
}
