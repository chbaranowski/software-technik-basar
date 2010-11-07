package basar.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasarFactoryTest {

	BasarFactory basarFactory = BasarFactory.instance;
	
	@Test
	public void testCreateBasarFacade() {
		assertNotNull(basarFactory.createBasarFacade());
	}

}
