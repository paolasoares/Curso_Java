
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoa = 3;

		// boolean acompanhado = quantidadePessoa >=2;
		boolean acompanhado;

		if (quantidadePessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Valor acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelimente vc nao pode entra");
		}
	
		


	/*atividade da aula 9 não complila, pois a variavel salario não 
		existe e o if e else esta for do bloco.
			boolean foiPromovido = true;

			if (foiPromovido) {
				double salario = 4200.0;
			} else {
				double salario = 3800.0;
			}

			System.out.println(salario);
	*/
	}
}
