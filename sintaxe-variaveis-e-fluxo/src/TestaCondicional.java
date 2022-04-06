
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 15;
		int quantidadePessoa = 0;
		if (idade >= 18) {
			System.out.println("Vc tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("vc nao tem mais de 18 anos, mas pode entrar, " + "pois esta acompanhado");
			
			}
			System.out.println("infelimente vc nao pode entra");
		}
		
		//atividade aula 6
		
		double salario = 3300.0;
		
		if(salario < 2600.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir R$ 350");
        }

        if(salario < 3750.0) {
            System.out.println("A sua aliquota é de 22,5%");
            System.out.println("Você pode deduzir R$ 636");
        }
	}

}
