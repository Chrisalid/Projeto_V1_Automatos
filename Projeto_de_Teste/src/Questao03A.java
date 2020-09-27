
public class Questao03A extends Questoes{
	
	public void questao03A(){
		int i = 0, j = 0, cont = 0, termonpertence = 0;
		String linguagem;
		
		System.out.println("Digite a sequencia na linguagens o's e k's: ");
		linguagem = getLerteclado().nextLine();
		j = linguagem.length() - 1;
		
		while(i <= j){
			if(linguagem.charAt(i) == 'o' || linguagem.charAt(i) == 'k'){
				if((linguagem.charAt(i) == 'o') && (linguagem.charAt(i+1) == 'k')) cont++;
			}
			else termonpertence++;
			i++;
		}
		
		if(termonpertence != 0 || cont == 0) System.out.println("Linguagem invalida!");
		else if(cont >= 1) System.out.println("Linguagem Aprovada!");
		
	}

}
