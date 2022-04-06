public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo);
		
		
		//Exemplo de concatenção
		String saudacao = "olá, meu nomme é ";
		String nome = "Paola ";
		String continuacao = "a minha idade é ";
		int idade = 22;
		System.out.println(saudacao+nome+continuacao+idade);
		
	}
}
