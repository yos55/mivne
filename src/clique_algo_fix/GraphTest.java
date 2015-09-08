package clique_algo_fix;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class GraphTest {

	@Test
	public void testGraphStringDoubleInt() {
		Graph g1 = new Graph ("C:/Users/amichay/workspace/matala02/src/graph10.txt", 0.7);
		assertTrue(g1.sizeOfE() == 6872);
		Graph g2 = new Graph ("C:/Users/amichay/workspace/matala02/src/graph10.txt", 0.982);
		assertTrue(g2.sizeOfE() == 1);


		
		//fail("Not yet implemented");
	}

}