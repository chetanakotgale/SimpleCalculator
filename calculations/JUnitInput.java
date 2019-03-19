package calculations;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitInput
{

	/**
	 * Test cases for the addition of two numbers.
	 */
	
	@Test
	public void additiontest()
	{
		
		Methods add=new Methods();
		assertEquals(6.00000000000000,add.addition(2, 4),0);
		assertEquals(20.100000000000000,add.addition(15, 5.1),0);
		assertEquals(30.888500000000000,add.addition(5.333, 25.5555),0);
		assertEquals(55.637132969999996,add.addition(5.513478, 50.12365497),0);
	}
	public void additionfail()
	{
		
		Methods add=new Methods();
		assertFalse(6.00000000000000!=add.addition(2, 4));
		assertFalse(20.100000000000000!=add.addition(15, 5.1));
		assertFalse(30.300000000000000!=add.addition(5.333, 25.5555));
		assertFalse(56.024691357799995!=add.addition(5.513478, 50.12365497));
		
	}
	
	
	/**
	 * Test cases for multiplication of two numbers.
	 */

	
	@Test
	public void multiplicationtest()
	{
		Methods mul=new Methods();
		assertEquals(" Executed Successfully ",24.0,mul.multiplication(4, 6),0);
		assertEquals(" Executed Successfully ",76.5,mul.multiplication(15, 5.1),0);
		assertEquals(" Executed Successfully ",136.28748149999998,mul.multiplication(5.333, 25.5555),0);
		assertEquals(" Executed Successfully ",276.35566895668563,mul.multiplication(5.513478, 50.12365497),0);
		
		}
	
	public void multiplicationfail()
	{
		Methods mul=new Methods();
		assertFalse(" Executed Successfully ",24.0!=mul.multiplication(4, 6));
		assertFalse(" Executed Successfully ",76.5!=mul.multiplication(15, 5.1));
		assertFalse(" Executed Successfully ",136.28748149999998!=mul.multiplication(5.333, 25.5555));
		assertFalse(" Executed Successfully ",276.35566895668563!=mul.multiplication(5.513478, 50.12365497));
		
	}
	
	/**
	 * Test cases for division of two numbers.
	 */

	@Test
	public void divisiontest()
	{
		Methods div=new Methods();
		assertEquals("Executed successfully",0.6666666666666666,div.division(4.0, 6),0);
		assertEquals("Executed successfully",2.9411764705882355,div.division(15, 5.1),0);
		assertEquals("Executed successfully",0.212,div.division(5.3, 25),0);
		assertEquals("Executed successfully",0.10956175298804781,div.division(5.5, 50.2000),0);
		
	}
	
	public void divisionfail()
	
	{
		Methods div=new Methods();
		assertFalse("Executed successfully",0.6666666666666666!=div.division(4.0, 6));
		assertFalse("Executed successfully",2.9411764705882355!=div.division(15, 5.1));
		assertFalse("Executed successfully",0.212!=div.division(5.3, 25));
		assertFalse("Executed successfully",0.10956175298804781!=div.division(5.5, 50.2000));
		
	}
}
