package exerciciosMatriz;

public class Atividade4 {

	public static void main(String[] args) {
		char mA[][] = {
				{'a','b','c','d'},
				{'e','f','g','h'},
				{'i','j','k','l'},
				{'m','n','o','p'}
		};
		
		for (char[]letra:mA) {
			for (char coluna:letra) {
				System.out.print(coluna + "\t");
		}
	System.out.println();
		}
    }
}