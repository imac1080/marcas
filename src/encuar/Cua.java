package encuar;

import java.util.ArrayList;
import java.util.Arrays;

public class Cua {
	int MIDA_MAX;
	int primer;
	int darrer;
	int mida;
	int elements[];

	public static void main(String[] args) throws Exception {
		Cua cola =new Cua(100000);
		double old = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			cola.encuar(i);
		}
		for (int i = 0; i < 100000; i++) {
			cola.desencuar();
		}
		double neww = System.currentTimeMillis();
		System.out.println(neww - old);
	}

	public Cua(int midaMax) {
		assert midaMax > 0;
		MIDA_MAX = midaMax;
		primer = 0;
		darrer = 0;
		mida = 0;
		elements = new int[MIDA_MAX];
	}

	public boolean esBuida() {
		return mida == 0;
	}

	public boolean esPlena() {
		return mida == MIDA_MAX;
	}

	public void encuar(int element) throws Exception {
		if (mida == MIDA_MAX) {
			throw new Exception("La cua és plena");
		}
		elements[darrer] = element;
		mida++;
		darrer++;
		if (darrer == MIDA_MAX) {
			darrer = 0;
		}
	}

	public int desencuar() throws Exception {
		if (mida == 0) {
			throw new Exception("La cua és buida");
		}
		int element = elements[primer];
		mida--;
		primer++;
		if (primer == MIDA_MAX) {
			primer = 0;
		}
		return element;
	}
}