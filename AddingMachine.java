/***
 * Assignment:2
 * Author:Assad Yousuf
 * StudentID:1212371223
 * ClassID:70641
 * 
 * This class oultines the addingmachine object which performs simple mathamatical opeartions
 */

package cse360assign2;
import java.util.*; 



public class AddingMachine {

	private int total;
	String history=new String();
	
	/**
	 * Constructor that is called to and sets total to 0 to get ready to perform operations on it.
	 * <p>
	 * This method always returns a AddingMachine object that has its total set to 0
	 * @return      AddingMachine object with total set
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history=Integer.toString(total);
	}
	
	 
	/**
	 * Returns the total variable
	 * <p>
	 * This method always returns an integer.
	 * @return      current value of the total Varaible
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Returns the value of total added together with the parameter passed in.
	 * <p>
	 * This method does not return anything
	 *
	 * @param      value to be added to total
	 */
	public void add (int value) {
		total=total+value;
		history=history+"+";
		history=history+Integer.toString(value);
	}
	
	
	/**
	 * Returns the value of total minus the parameter passed in.
	 * <p>
	 * This method does not return anything
	 *
	 * @param      value to be subtracted from total
	 */
	public void subtract (int value) {
		total=total-value;
		history=history+"-";
		history=history+Integer.toString(value);
	}
	
	/**
	 * Returns the history of all values and operations performed to total
	 * <p>
	 * This method returns a string containing all past values and operations
	 *
	 * @return      string containing history of all values and operations
	 */	
	public String toString () {
		return history;
	}
	
	/**
	 * This method clears the total variable by setting it to 0
	 * <p>
	 * 
	 * This method does not return anything.
	 * @param        N/A
	 * @return       N/A
	 */	
	public void clear() {
	    total=0;
	}
	
}

