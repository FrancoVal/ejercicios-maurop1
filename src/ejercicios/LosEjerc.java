package ejercicios;

public class LosEjerc {
	public static boolean tieneDosLetrasE(String s) {
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'e') {
				cont++;
			}
		}
		if (cont == 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean sonIguales(String s1, String s2) {
		try {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
			}
		} catch (RuntimeException e) {
			System.out.println("el largo de las palabras no coinciden");
		}
		return true;
	}

	// TODO: fijate que el metodo de arriba si pones "pelos" y "pelo" se rompe
	// porque no tienen el mismo length.

	public boolean coso(String s1, String s2) {
		return (s1 == s2) ? true : false;
		/*
		 * Es una manera de abreviar el if else esto, no te lo van a enseñar hasta p3
		 * creo. Si sabes que vas a usar un if else nada mas haces esto: 1) Pones un
		 * "return" 2) Dentro pones una condicion, en este caso si s1 es igual a s2 3)
		 * Pones un signo de pregunta (?) y despues lo que tendria que devolver si da
		 * verdadero la condicion. 4) Pones dos puntos (:) y lo que pasaría si va al
		 * "else", osea, si la condicion es falsa. 5) Ta, aprendiste a hacer un if else
		 * en una sola linea.
		 * 
		 * Aca te dejo como lo harias de la manera larga: if(s1==s2){ return true; }
		 * else{ return false;
		 */
	}

	// TODO: por ejemplo acá, hablando de lo de arriba, si son iguales devuelvo cero
	// y si son distintos devuelvo uno.
	public int cosoint(int a, int b) {
		return (a == b) ? 0 : 1;
	}

	public void imprimir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				System.out.print("{" + a[i]);
			} else if (i == a.length - 1) {
				System.out.print("," + a[i] + "}");
			} else {
				System.out.print("," + a[i]);
			}
		}
	}

	public int maximo(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public double promedio(int[] a) {
		double acum = 0;
		for (int i = 0; i < a.length; i++) {
			acum += a[i];
		}
		double prom = acum / a.length;
		return prom;

	}

	public int[] agregarAtras(int[] a, int x) {
		int[] newarr = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			newarr[i] = a[i];
		}
		newarr[a.length] = x;
		return newarr;
	}

	public int[] quitar(int[] a, int x) {
		int[] newarr = new int[a.length - 1];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != x) {
				newarr[j++] = a[i];
			}
		}
		return newarr;
	}

	public int[] reverso(int[] a) {
		int[] newarr = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i > -1; i--) {
			newarr[j++] = a[i];
		}
		return newarr;
	}

	public int[] opuesto(int[] a) {
		int[] newarr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			newarr[i] = a[i] * -1;
		}
		return newarr;
	}
}
