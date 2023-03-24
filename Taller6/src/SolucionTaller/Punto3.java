package SolucionTaller;

public class Punto3 {

	public static void main(String[] args) {
//3.Declare e inicialice un array de 2 dimensiones denominado arreglo de un tipo largo que tenga 4 filas y 3 columnas 
//para que todos los valores estén configurados en 5.
		long[][] arreglo = new long[4][3];
		for (int i = 0; i < 4; i++) {
			for (int j1 = 0; j1 < 3; j1++) {
				arreglo[i][j1] = 5;
				System.out.println(arreglo[i][j1] + " ");
			}
		}

	}
}
