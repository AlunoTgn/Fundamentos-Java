
public class LacoRepeticao {

	public static void main(String[] args) {
		// Comando WHILE - laço pré-testado
		System.out.println("Comando WHILE");
		int qtdVezes = 1;

		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++; // qtdVEZES = qtdVEZES + 1

		}
		System.out.println("Sai do laço e executei " + (qtdVezes - 1) + " vezes");

		// DO WHILE - laço-pós testado
		System.out.println("Comando DO...WHILE");
		qtdVezes = 1;
		do {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++; // qtdVEZES = qtdVEZES + 1

		} while (qtdVezes <= 10);
		System.out.println("Sai do laço e executei " + (qtdVezes - 1) + " vezes");

		// For
		System.out.println("Comando FOR");
		qtdVezes = 0;

		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
			qtdVezes = qtdVezes1;

		}
		System.out.println("Sai do laço e executei " + (qtdVezes) + " vezes");

		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
			if (qtdVezes1 == 5) {
				System.out.println("Parei na " + qtdVezes1 + "ª vez");
				break;

			}

		}

	}

}