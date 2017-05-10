package labtest1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {
    LightBulb bulb1;
	@Before
	public void setUp() throws Exception {
		bulb1=new LightBulb(400);
	}

	@Test
	public void testGetBulbWattage() {
		//fail("Not yet implemented");
		assertEquals(400,bulb1.getBulbWattage());
	}

}
