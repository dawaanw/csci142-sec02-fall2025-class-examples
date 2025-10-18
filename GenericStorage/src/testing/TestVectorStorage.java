package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import storage.VectorStorage;

class TestVectorStorage {
	
	private VectorStorage data;

	@BeforeEach
	void setUp() throws Exception {
		data = new VectorStorage();
	}

	@Test
	void testAddOneElement() {
		assertTrue(data.add(4), "Should be able to add one element");
		assertEquals(1, data.count(), "Added one element, should have count = 1");
	}
	
	@Test
	void testRemoveFromEmpty() {
		try {
			data.remove(0);
			fail("Should not be able to remove from empty vector");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expect this, so do nothing!
		}
		
	}

}
