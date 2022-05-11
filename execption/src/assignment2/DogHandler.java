package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
/**
 * Assignment2 Part 2, it includes two inner exception classes and it is
 * used to test the exception type inheritance hierarchy
 * @author Lin Wang
 *
 */
public class DogHandler {

	/**
	 * this main method using try catch format  to check the dog's registration status
	 * and catch the corresponding exceptions.
	 * In the try block, it invokes the dogTest() method and catch the exception of this
	 * method. In catch block, capture the exception and print the exceptions message
	 * @param args null
	 */
	public static void main(String[] args) {
		System.out.println("-------Part 2, DogHandler Test--------");
		try {
			DogHandler handler = new DogHandler();
			handler.dogTest();					  
		}
		catch (ExceptionDog e) {
			System.err.println(e);	
		}
		catch (NullPointerException e){
			e.printStackTrace();
		}
		catch (IOException e) { 
			System.err.println(e);		
		}		

	}
/**
 *  Exception Class ExceptionDog, an inner class inherits from the Exception
 * @author Lin Wang
 *
 */
	public class ExceptionDog extends Exception{

	}
	
	/**
	 *  Exception Class ExceptionDog, an inner class inherits the ExceptionDog
	 * @author Lin Wang
	 *
	 */
	public class ExceptionPuppy extends ExceptionDog {
		
		
	}

	/**
	 * This method is used to check the dog registration status and throw
	 * different exceptions
	 * @throws ExceptionDog  happened when check the dog name of user input	
	 * @throws NullPointerException happened when user input the an invalid dog name
	 * @throws FileNotFoundException happened when the register file is not found
	 */
	public void dogTest() throws ExceptionDog,NullPointerException,FileNotFoundException {
		boolean flag = false;
        // prompt user to input a dog name
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your puppy name :");
		String puppy = input.next();
        // open "dog.txt" file to get registered dog list
		Scanner openFile = new Scanner(new File("dog.txt")); // FileNotFoundException may happen

		while (openFile.hasNext()) {
			String list = openFile.next();
			//System.out.println(" list dog is :" +list +"input dog is " +puppy); 
			if (puppy.length() >20) {
				puppy = null;  // to test nullPointerException
				System.out.println(puppy.charAt(0));
			}else {
				if (puppy.equalsIgnoreCase(list)) {
					flag= true;
					//if dog is  registered, yield an ExceptionDog exception
					throw new ExceptionDog();  
				}
			}
		}
		openFile.close();
		input.close();
		if (!flag) {
			//if dog is  not registered yet, yield an ExceptionPuppy exception
			throw new ExceptionPuppy();
		}

	}	

}


