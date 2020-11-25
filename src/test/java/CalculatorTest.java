
import com.mycompany.calculator.Calculator;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	

	Calculator calculator;
	int tab[];

	
	@Before
	public void setup() {
		 calculator= new Calculator();
		 tab= new int[] {9,0,7,5,8};
	}

	@Test
	public void testSum() {
		
		// When
		int result = calculator.sum(2, 2);
		//Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
			
		}

	}

	@Test
	public void testMinus() {
		Assert.assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(2, calculator.divide(6, 3));
	}
	
	
	@Test 
	public void testMultiply() {
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 4987b0aaa07ff8a8aaa818e00ca3078d993907ba
=======

>>>>>>> Mountaha_Ndoye
		Assert.assertEquals(12, calculator.multiply(6, 2));

	}
	@Test
	public void testMin () {
		Assert.assertEquals(10,calculator.min(10,29));
	}

	@Test
	public void testMax()
	{
		Assert.assertEquals(29,calculator.max(10,29));
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 4987b0aaa07ff8a8aaa818e00ca3078d993907ba
=======

>>>>>>> Mountaha_Ndoye
		calculator.divide(6, 0);
	}
	@Test
	public void test_minOfList() {
		
		
		Assert.assertEquals(0,	calculator.minElement(tab));
	}
	@Test
	public void test_maxOfList() {
		
		
		Assert.assertEquals(9,	calculator.maxElement(tab));
	}
}
