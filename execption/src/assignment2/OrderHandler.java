package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 * Assignment4 Part4
 * This class is used to test the the polymorphisms of Exeception type
 * @author Lin Wang
 *
 */
public class OrderHandler {
	/**
	 * The main method is used to test the polymorphisms of Exeception type
	 * After throwing an IOException,the IOException type needs to be caught first then catch other
	 * Exceptions. 
	 * @param args  null
	 */
	public static void main(String[] args) {
		System.out.println("-------Part 4, OrderHandler Test--------");

		try {
	
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

}
