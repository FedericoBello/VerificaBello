import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BelloTest {

	
//errore nel risultato atteso
		  @Test
		  void Test1() {
			  BelloClass b=new BelloClass();
		    
		    assertEquals(b.BelloMet(3, 7),27);
		  }
//errore nel risultato atteso	  
		  @Test
		  void Test2() {
			  BelloClass b=new BelloClass();
		    
		    assertEquals(b.BelloMet(0,1),1);
		  }
		  
		  @Test
		  void Test3() {
			  BelloClass b=new BelloClass();
		    
		    assertEquals(b.BelloMet(0, 0),1);
		  }

		
	

}
