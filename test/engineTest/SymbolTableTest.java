package engineTest;

import static org.junit.Assert.*;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import engine.SymbolTable;
import engine.UniqueSymbolGenerator;

public class SymbolTableTest {
	
//  Might need these when the Symbol table becomes more complicated
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		
//	}

	
    /**
     * Unit tests the {@code RedBlackBST} data type.
     *
     * @param args the command-line arguments
     */
	@Test
    public void SymbolTreeTester() { 
		
		UniqueSymbolGenerator gen = new UniqueSymbolGenerator();
        SymbolTable<String, Integer> st = new SymbolTable<String, Integer>();
        
        assertEquals(0,st.size());
        
        for (int i = 0; i < 10; i++) {
            String key =  Integer.toString(i);
            st.put(key, i);
        }
        
        assertEquals(10, st.size());
        assertEquals(st.max(), "9");
        
        for (String s : st.keys()) {
        		assertEquals(Integer.valueOf(s), st.get(s));
        		st.delete(s);
        }
        
        assertEquals(st.isEmpty(), true);
	}
}
