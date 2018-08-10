package xspeedit.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test
	 */
	public void testApp() {
		String[] args = new String[1];

		args[0] = "163841689525773";
		App.main(args);
		args[0] = null;
		App.main(args);
		args[0] = "a163841689525773";
		App.main(args);
		args[0] = "abcd";
		App.main(args);
		args[0] = "(àç'(ç'";
		App.main(args);
		args[0] = "";
		App.main(args);
		args[0] = "163841689525773154815484515787113232312154874";
		App.main(args);

	}
}
