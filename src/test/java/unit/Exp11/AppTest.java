package unit.Exp11;

import static org.junit.Assert.*;


public class AppTest 
{
 
    @Test
    public void test()
	{
		App p=new App();
		assertEquals(20,p.add(10,10));
	}
}
