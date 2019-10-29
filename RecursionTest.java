public class RecursionTest {
	
	public void testFactorial() throws AssertException {
		Recursion recursion = new Recursion();
		int expected = recursion.factorial(10);
		int actual = 3628800;
		Assert.assertEquals(expected, actual);
	}
	


	
	public void testNNaryTreeSize() throws AssertException {
		Recursion recursion = new Recursion();
		int expected = recursion.nnaryTreeSize(3, 5);
		int actual = 121;
		Assert.assertEquals(expected, actual);

	}
	
	

	public void testTree() throws AssertException {
		Recursion recursion = new Recursion();

		Tree tree = new Tree(5);
		//Create 4 Children to add to the tree
		Tree child1 = new Tree(22);
		Tree child2 = new Tree(100);
		Tree child3 = new Tree(16);
		Tree child4 = new Tree(102);
		
		//Add children to the tree.
		tree.add(child1);
		tree.add(child2);
		tree.add(child3);
		tree.add(child4);
		
		int actual = 245;
		Assert.assertEquals(recursion.treeSum(tree), actual);
		
	}
	
	
	
	public void testCircSqua() throws AssertException {
		Recursion recursion = new Recursion();
		double actual = recursion.circledSquared(true, 12.0, 5);
		double expected = 385.6460;
		Assert.assertEquals(expected, actual, .0001);
		
		
	}
	
}

