package houl;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



public class BowlingGameTest {
	private Game g;
    @Before
    public void testCreateGame(){
    	g = new Game();
    }
    
    public void rollMany(int n,int pins){
    	for(int i=0 ; i<n ; i++) 
    		g.roll(pins); 
    }
	@Test
    public void testGutterGame() {        
        int n = 20;
        int pins = 0;
        rollMany(n,pins);
        assertEquals(0,g.score()); 
    }
    @Test
    public void testAllOnes(){    	
    	int n = 20;
        int pins = 1;
        rollMany(n,pins);
    	assertEquals(20,g.score());     	
    }
    /*
    @Test
    @Ignore
    public void testOneSpare(){
    	g.roll(5);
    	g.roll(5);//spare
    	g.roll(3); 
    	rollMany(17,0);
    	assertEquals(16,g.score()); 
    }     */
}
