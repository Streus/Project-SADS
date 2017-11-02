package engineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import engine.RedBlackBST;
import engine.UniqueSymbolGenerator;

public class RedBlackBSTTest {

    /**
     * Unit tests the {@code RedBlackBST} data type.
     *
     * @param args the command-line arguments
     */
	@Test
    public void SymbolTreeTester() { 
		UniqueSymbolGenerator gen = new UniqueSymbolGenerator();
		
        RedBlackBST<String, Integer> st = new RedBlackBST<String, Integer>();
        for (int i = 0; i < 10; i++) {
            String key =  Integer.toString(i+1);
            st.put(key, i);
        }
	}
}
