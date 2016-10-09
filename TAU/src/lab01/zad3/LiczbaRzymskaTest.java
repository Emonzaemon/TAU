package lab01.zad3;

import org.junit.Test;

public class LiczbaRzymskaTest {

	@Test
	public void testRomanConversion() {

	    for (int i = 1; i<= 100; i++) {
	        System.out.println(i+"\t =\t "+LiczbaRzymska.toString(i));
	    }
	        
	    for (int i = 2; i<= 10; i++) {
		        System.out.println(i*100+"\t =\t "+LiczbaRzymska.toString(i*100));
	    }
	   
	}


}
