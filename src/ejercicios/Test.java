package ejercicios;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * Si INICIAS la clase (haciendo lo que hice abajo) no hace falta que vuelvas a escribir el nombre de la clase una y otra vez
		 * Por ejemplo, tendrias que poner LosEjerc.sonIguales
		 * 
		 * Iniciar una clase es hacer esto:
		 * 1) Pones el nombre de la clase, en este caso "LosEjerc"
		 * 2) Le das un nombre, como si fuera una variable poneel, en este caso "ejercicios"
		 * 3) Pones un =
		 * 4) Pones "new", es para decir que es una inicializacion "nueva".
		 * 5) Pones el nombre de la clase (ATENTO, algunas clases vas a hacer que necesitan parametros, aca se los pasas adentro del paréntesis, en este caso no hay que hacer eso
		 * 6) Listo, punto y coma (;) y ta.
		 */
		LosEjerc ejercicios = new LosEjerc();
		int[] arregloprueba= {2,6,978,4,653,37,8};
//		ejercicios.imprimir(arregloprueba);
//		System.out.println(ejercicios.maximo(arregloprueba));
		ejercicios.imprimir(ejercicios.opuesto(arregloprueba));

	}
}
