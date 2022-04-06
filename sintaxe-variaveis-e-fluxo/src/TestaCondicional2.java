
public class TestaCondicional2 {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoa = 3;
		boolean acompanhado = quantidadePessoa >=2;
		
		System.out.println("Valor acompanhad= "+acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelimente vc nao pode entra");
		}
	}

}