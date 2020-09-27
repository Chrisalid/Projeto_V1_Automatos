
public class Questao01A extends Questoes{
	public void questao01A(){

		int i = 0, j = 0, x = 0, cont = 0, termonpertence = 0;
		String linguagem;
		
		System.out.println("Digite a sequencia no alfabeto {a,b}: ");;
		linguagem = getLerteclado().nextLine();
		j = linguagem.length() - 1;
		x = linguagem.length() - 1;
		if((x+1) % 2 != 0) {
			System.out.println("Sequencia Invalida\n");
			return;
		}
		
		while(i <= x/2){
			if(linguagem.charAt(i) == 'a' || linguagem.charAt(j) == 'b'){
				if(linguagem.charAt(i) == linguagem.charAt(j)) cont++;
			}
			else termonpertence++;
			i++;
			j--;	
		}
		if(termonpertence != 0) System.out.println("Sequencia Invalida!\n");
		else if(cont == (x+1)/2) System.out.println("Linguagem Aprovada!\n");
		else System.out.println("Sequencia Invalida!\n");
		
	}
}
