package encuar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuaTest {

	@Test
	void test() throws Exception {
		 Cua q = new Cua(3);
		 assertEquals(true, q.esBuida());
		 q.encuar(10);
		 q.encuar(11);
		 assertEquals(10, q.desencuar());
		// assertEquals(11, q.desencuar());
		// assertEquals(true, q.esBuida());
		 assertThrows(Exception.class, () -> {
			 q.desencuar();
		 });
		 // La cua és buida; desencuar ha de llançar una excepció
	}
}
