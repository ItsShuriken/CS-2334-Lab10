import org.junit.Assert;
import org.junit.Test;
public class RecursionTest {
	@Test
	public void testFactorial() {
		Recursion recursion = new Recursion();
		int expected = recursion.factorial(10);
		int actual = 3628800;
		Assert.assertEquals(expected, actual);
	}
	


	
	public void testNNaryTreeSize() {
		Recursion recursion = new Recursion();
		int expected = recursion.nnaryTreeSize(3, 5);
		int actual = 121;
		Assert.assertEquals(expected, actual);

	}
	
	
	
}

