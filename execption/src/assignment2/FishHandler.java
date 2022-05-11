package assignment2;
/**
 * Assignment2 Part 3,it includes two  test methods, it is used to test re-throw an exception
 * @author Lin Wang
 *
 */
public class FishHandler {
	public static final int ENDDATE = 20;  //activity end date
/**
 * this main method using try catch format to check whether the activity is end or not
 * and catch the corresponding exceptions.
 * In the try block, it invokes the easterStarting() method and catch the exception which thrown
 *   by easterEnding() in catch block.
 * @param args null
 */

	public static void main(String[] args) {
		FishHandler handler = new FishHandler();
		System.out.println("-------Part 3, FishHandler Test--------");
		try {
			handler.easterStarting(28);
		}catch(Exception e){ //catch the easterStarting exception
			System.err.println(e);
			
		}
	}
/**
 * method easterEnding,it is used to check whether the user input date is later than 
 * scheduled ENDATE, if yes,throw an exception.
 * @param date  the date user input
 * @throws Exception happened when input date is later than the scheduled ENDDATE
 */
	public void easterEnding(int date) throws Exception {
		if (date > ENDDATE) {
			throw new Exception();
		}		
	}

	/**
	 *  method easterStarting, to catch the easterEnding()'s exception message and output the exception message.
	 * @param date the date user input
	 * @throws Exception  same as easterEnding()'s exception 
	 */
	public void easterStarting(int date) throws Exception {

		try {
			easterEnding(date);  //Test for ending date
		}
		catch(Exception e) { //catch the easterEnding exception
			System.err.println(e);
			throw new Exception(e.getMessage()); //re-throw the above exception
		}
	}

}
