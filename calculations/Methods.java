package calculations;

/**
 *  This program is to find addition, multiplication and division of two numbers.
 *  
 * @author chetana
 *
 */
public class Methods 
{
	
	public double addition (double number_1,double number_2)
	{
		
		/**
		 * @param number_1
		 * @param number_2
		 *  This method adds two numbers and returns the result.
		 * 
		 */
		
		return number_1+number_2;
	}
	
	public double multiplication (double number_1,double number_2)
	{
		
		/**
		 * @param number_1
		 * @param number_2
		 *  This method multiplies two numbers and returns the result.
		 * 
		 */
		
		return number_1*number_2;
	}
	public double division (double number_1,double number_2)
	{
		
		/**
		 * @param number_1
		 * @param number_2
		 *  This method multiplies two numbers and returns the result.
		 * 
		 */
		
		if(number_2==0)
		{
			
			/**
			 * 
			 * If denominator is 0 it returns as illegal argument exception.
			 * 
			 */
			throw new IllegalArgumentException("Number cannot be divided by zero");
			
		}
		
		else
		{
			return number_1/number_2;
		}
	}
}