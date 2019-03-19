package encuar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuaTest2 {

	@Test
	void test() throws Exception {
		 Cua q = new Cua(3);
		 assertThrows(Exception.class, () -> {
			 q.mida = q.MIDA_MAX;
			 q.encuar(1);
		 });
		// La cua és plena; encuar ha de llançar una excepció
		 assertThrows(Exception.class, () -> {
			 q.darrer = q.MIDA_MAX;
			 q.encuar(1);
		 });
		// La cua ha de donar la volta; darrer es ara la primera posicio
		 assertThrows(Exception.class, () -> {
			 q.mida = 0;
			 q.desencuar();
		 });
		// La cua és buida; desencuar ha de llançar una excepció
		 assertThrows(Exception.class, () -> {
			 q.primer = q.MIDA_MAX;
			 q.desencuar();
		 });
		// La cua ha de donar la volta; p es ara la primera posicio
	}

}
