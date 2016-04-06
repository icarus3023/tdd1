package houl;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



import static org.junit.Assert.*;
import org.junit.Test;
import houl.Calculator;

public class Testing {

	@Test
	public void testaddline(){
		Calculator cal1 = new Calculator(); //assertEquals(a,b)
		cal1.line = 5;
		assertEquals(cal1.addline(),2);
	}

	@Test
	public void testcalline(){ // �쉶�꽑�쑝濡쒕쭔 異붽��릺�뒗 �슂湲� test
		Calculator cal2 = new Calculator();//assertEquals(a,b)
		cal2.grade = 1;
		cal2.line = 4;
		assertTrue(cal2.calline()==34);
	}
	
	@Test
	public void testcalminute(){
		Calculator cal3 = new Calculator();//assertEquals(a,b)
		cal3.grade = 1;
		cal3.time = 878;
		assertTrue((cal3.calminute()-49.95)<0.1&&(cal3.calminute()-49.95)>=0);
	}

	@Test
	public void testmoney(){		
		Calculator cal4 = new Calculator();//assertEquals(a,b)
		cal4.grade = 2;
		cal4.line = 2;
		cal4.time = 523;
		int temp = (int)cal4.money();
		assertTrue(temp==63);
	}
}
