package stLab1;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import stLab1.riangle;
import static org.junit.Assert.*;

public class TestStLab1 {
	@RunWith(Parameterized.class)
	public static class TestRiangle{
		private int a;
		private int b;
		private int c;
		private String expected;
		private riangle tri = null;
	
		public TestRiangle(int a,int b,int c, String expected){
			this.a = a;
			this.b = b;
			this.c = c;
			this.expected = expected;
		}
		
		@Before
		public void setUp(){
			tri = new riangle();
		}
		@Parameters
		public static Collection<Object[]> getData(){
			return Arrays.asList(new Object[][]{
					{1,1,1,"eTri"},
					{2,3,5,"noTri"},
					{3,5,3,"iTri"},
					{3,5,4,"sTri"},
					{-2,3,5,"noTri"}
			});
		}
		@Test
		public void testWhichTri() {
			assertEquals(this.expected, tri.whichTri(a, b, c));
		}		
	}
}
