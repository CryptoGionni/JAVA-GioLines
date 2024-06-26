package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import boundary.BoundaryImpiegato;

public class testBoundaryImpiegato {
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test Start!\n");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Test Finished!\n");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

    /*Test Case: 4 */
	@Test
	public void testCheckNumeroBagagli(){   
		int NUMEROBAGAGLI = -2;
		int NUMEROSEDILI = 2; 
		boolean res = BoundaryImpiegato.checkNumeroBagagli(NUMEROBAGAGLI, NUMEROSEDILI);
        boolean expected = true;
        assertEquals(expected, res);
    }

	/*Test Case: 5 */
	@Test
	public void testCheckNumeroBagagli_zeros(){   
		int NUMEROBAGAGLI = 4;
		int NUMEROSEDILI = 2; 
		boolean res = BoundaryImpiegato.checkNumeroBagagli(NUMEROBAGAGLI, NUMEROSEDILI);
        boolean expected = true;
        assertEquals(expected, res);
    }

	//stesso test case ma con possibilità di inserimento da tastiera
	// @Test
	// public void testInserisciNumeroBagagli(){    
	// 	int res = BoundaryImpiegato.inserisciNumeroBagagli(3);
    //     int expected = 1;
    //     assertEquals(expected, res);
    // }

    /************* *************/

	/*Test Case: 6 */
	@Test
	public void testCheckDimensioneBagaglio(){    
		String DIMENSIONIBAGAGLIO = "12-18,10";
		boolean res = BoundaryImpiegato.checkDimensioneBagaglio(DIMENSIONIBAGAGLIO);
        boolean expected = true;
        assertEquals(expected, res);
    }

	//stesso test case ma con possibilità di inserimento da tastiera
    // @Test
	// public void testInserisciDimensioneBagaglio(){   
	// 	String[] res = BoundaryImpiegato.inserisciDimensioneBagaglio();
    //     String[] expected = {"3","3","3"};
    //     assertSame(expected, res);
    // }

    /************* *************/

	/*Test Case: 8 */
	@Test
	public void testCheckPrezzoBigliettoMassimo(){    
		float PREZZOBIGLIETTIMASSIMO = -0.5F;
		boolean res = BoundaryImpiegato.checkPrezzoBigliettoMassimo(PREZZOBIGLIETTIMASSIMO);
        boolean expected = true;
        assertEquals(expected, res);
    }

	//stesso test case ma con possibilità di inserimento da tastiera
    // @Test
	// public void testInserisciPrezzoBigliettoMassimo(){    
	// 	float res = BoundaryImpiegato.inserisciPrezzoBigliettoMassimo();
	// 	float expected = 1F;
	// 	assertSame(expected, res);
	// }
	
    /************* *************/

}
