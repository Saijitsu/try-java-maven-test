package unittest;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatriceTest {

	@Test
	public void diviseTest() throws MonException {
		// fail("Not yet implemented");
		Assert.assertEquals(3, Calculatrice.divise(6, 2));
	}

	@Test
	public void diviseTest3() throws MonException {
		Assert.assertEquals(5, Calculatrice.divise(10, 2));
	}

	@Test(expected = MonException.class)
	public void diviseTest2() throws MonException {
		Assert.assertEquals(3, Calculatrice.divise(6, 0));
	}

	@Test
	public void diviseTest4() throws MonException {
		Assert.assertEquals(3, Calculatrice.divise(6, 2));
		try {
			Calculatrice.divise(6, 0);
		} catch (Exception e) {
			Assert.assertEquals("Ca ne marche pas!", e.getMessage());
			e.printStackTrace();
		}
	}

}
