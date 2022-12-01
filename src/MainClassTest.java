import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class MainClassTest {

	@Test
	public void stringContains2() {
		String mainString = null;
		String subString = null;
		boolean actual = MainClass.stringContains(mainString, subString);

		assertFalse(actual);
	}

	@Test
	public void stringContains3() {
		String mainString = "";
		String subString = null;
		boolean actual = MainClass.stringContains(mainString, subString);

		assertFalse(actual);
	}
}
