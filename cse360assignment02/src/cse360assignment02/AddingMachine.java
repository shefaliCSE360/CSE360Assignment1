/**
 * @author Shefali Deosthali
 */	
package cse360assignment02;

public class AddingMachine 
{
	public static void main(String args[])
	{
	
	}
	private int total; //total variable defined
	private String history; //String history defined
			
	/**
	* Method to initialize variables 
	*/
	public AddingMachine()
	{
		total = 0;
		history = "0";
	}
			
	/**
	* Return the current total 
	* @return current total
	*/
	public int getTotal()
	{
		return total;
	}

	/**
	* Add parameter to total variable 
	* @param int value, which will be added to total variable 
	*/
	public void add(int value)
	{
		total = total + value; 
		history = history + " + " + String.valueOf(value); 
	}
			
	/**
	* Subtract parameter from total variable 
	* @param int value, which will be subtracted from total variable
	*/
	public void subtract(int value)
	{
		total = total - value; 
		history = history + " - " + String.valueOf(value); 
	}
			
	/**
	* History of transactions starting from 0 value to the last input
	* @return history of transactions
	*/
	public String toString()
	{
		return history; 
	}
			
	/**
	* Clear method to clear "memory"
	*/
	public void clear()
	{
		total = 0;
		history = "0";
	}
}
