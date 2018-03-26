package engineTest;

import static org.junit.Assert.*;

import java.util.Random;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

import engine.SADSstring;
import engine.SymbolTable;
import engine.UniqueSymbolGenerator;

public class SymbolTableTest {
	
	public int TEST_ITER = 10;
	public int STRING_SIZE = 15;
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
        
        for (int i = 0; i < TEST_ITER; i++) {
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
	
	@Test 
	public void SymbolTreeSADSstringTester() {
		SymbolTable<SADSstring, Integer> sadTree = new SymbolTable<SADSstring, Integer>();
		StringBuilder sb = new StringBuilder();
		
		//tests randomly generated SADstrings in SymbolTable tree 
		for (int i = 0; i < TEST_ITER; i++) {
			
			assertEquals(i, sadTree.size());
			
			//create a random string of 1's and 0's of size STRING_SIZE
			for (int j = 0; j < STRING_SIZE; j++) {
				Random rnd = new Random();
				char c = (char) (rnd.nextInt(26) + 'a');
				sb.append(c);
			}
			
			//put the string into the symbol table
			SADSstring newString = new SADSstring(sb.toString());
			sadTree.put(newString, i);   
		}
		
		assertEquals(TEST_ITER, sadTree.size());
		
		//check for accurate max values 
		for(int i=sadTree.size()-1; i>=0; i--) {
			int maxVal = sadTree.get(sadTree.max());
			int actualMaxVal = i;
			
			assertEquals(maxVal, actualMaxVal);
			sadTree.deleteMax();
		}
		
		assertEquals(0, sadTree.size());
		 
		//ensure that when a SADSstring key is put into the tree 
		//and replaced, the new string points to the original value
		SADSstring originalStr = new SADSstring("original");
		
		sadTree.put(originalStr, 1111);
		int originalVal = sadTree.get(originalStr);
		assertEquals(originalVal, 1111);
		
		sadTree.put(originalStr, 0000);
		int replacedVal = sadTree.get(originalStr);
		assertEquals(replacedVal, 0000);
		
		//TODO: test SADSstrings that are generated 
		
		
	}
	
	@Test
	public void OverwriteTester() {
		
		UniqueSymbolGenerator gen = new UniqueSymbolGenerator();
		SymbolTable<String, Integer> uniqueTree = new SymbolTable<String, Integer>();
		int original = 0000;
		int replaced = 1111;
		
		uniqueTree.put("x", original);
		int xVal = uniqueTree.get("x");
		assertEquals(xVal, original);
		
		uniqueTree.put("x", replaced);
		int newXVal = uniqueTree.get("x");
		assertEquals(newXVal, replaced);
		
	}
}
