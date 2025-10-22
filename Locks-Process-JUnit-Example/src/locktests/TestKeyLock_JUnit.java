package locktests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lock.KeyLock;

class TestKeyLock_JUnit {

	private KeyLock keyLock;
	
	@BeforeEach
	void setUp() throws Exception {
		keyLock = new KeyLock(4);
	}

	@Test
	void testInsertBadKey() {
		assertFalse(keyLock.insertKey(5), "Wrong key, should fail!");
	}
	
	@Test
	void testInsertGoodKey() {
		assertEquals(true, keyLock.insertKey(4), "Correct key, this should work!");
	}
}


