package is.ru.ticktacktoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

//for Exception
import org.junit.Rule;
import org.junit.rules.ExpectedException;




public class TickTackToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.ticktacktoe.TickTackToeTest.java");
    }

	@Test
	public void testintRet() {
		assertEquals(0, TickTackToe.intRet());
	}


	@Test
	public void runMain() {
		String[] params = new String[]{"p1","p2","p3"};
		TickTackToe tick = new TickTackToe();
		tick.main(params);
		
	}

}