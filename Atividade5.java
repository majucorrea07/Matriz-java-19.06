package exerciciosMatriz;

public class Atividade5 {

	public static void main(String[] args) {
		char dA[][] = {
				{'*','*','*','*'},
				{'*','*','*'},
				{'*','*'},
				{'*'}
		};
	
		for (char[]letra:dA) {
			for (char coluna:letra) {
				System.out.print(coluna + "\t");
			}
				System.out.println();
	}
  }
}
