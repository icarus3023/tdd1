package cnu.lecture.tdd1;

import org.junit.Test;

/**
 * Created by tchi on 2016. 4. 4..
 */
public class BowlingGameTest {
	private Game g;
    @Before
    public void testCreateGame(){
    	g = new Game();
    }
    @Test
    public void rollMany(int n,int pins){
    	for(inti=0;i<n;i++) 
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
   
}
