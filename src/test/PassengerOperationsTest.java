package test;

import static org.junit.Assert.*;
import main.PassengerOperations;

import org.junit.Before;
import org.junit.Test;

public class PassengerOperationsTest {

	PassengerOperations passengerOperations;

	@Before
	public void setup() {
		passengerOperations = new PassengerOperations();
	}

	@Test
	public void should_return_zero_empty_string() {

		int sum = 0;
		try {
			sum = passengerOperations.addPassengers("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0, sum);
	}

	@Test
	public void should_return_same_value_when_single_value_passed() {
		int sum = 0;
		try {
			sum = passengerOperations.addPassengers("4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(4, sum);
	}
	
	

	@Test
	public void should_return_sum_value_when_two_value_passed() {

		int sum = 0;
		try {
			sum = passengerOperations.addPassengers("4,5");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(4+5, sum);
	}
	
	@Test(expected = Exception.class)
	public void should_return_exception_when_sum_greater_than_100() throws Exception {
		
			int sum = passengerOperations.addPassengers("50,51");
		

		
	}
	
	@Test
	public void should_accept_newline_instead_of_comma() throws Exception {
		
		int sum = 0;
		try {
			sum = passengerOperations.addPassengers("1\n2,3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(1+2+3, sum);
	}
	
	@Test
	public void should_not_accept_newline_as_variable() throws Exception {
		
		int sum = 0;
		try {
			sum = passengerOperations.addPassengers("1,\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(1, sum);
	}
	
	@Test
	public void should_accept_any_delimiter_and_add() throws Exception {
		
		int sum = 0;
		try {
			sum = passengerOperations.addPassengers("//;\n1;3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(1+3, sum);
	}

	
}



