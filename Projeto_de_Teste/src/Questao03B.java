
public class Questao03B extends Questoes{
	public void questao03B(){
			
			int i = 0, j = 0, cont0 = 0, cont1 = 0, termonpertence = 0;
			String linguagem;
			
			System.out.println("Digite a sequencia na linguagens 0's e 1's: ");
			linguagem = getLerteclado().nextLine();
			j = linguagem.length() - 1;
			
			while(i <= j){
				if(linguagem.charAt(i) == '0' || linguagem.charAt(i) == '1'){
					if(linguagem.charAt(i) == '0') cont0++;
					if(linguagem.charAt(i) == '1') cont1++;
				}
				else termonpertence++;
				i++;
			}
			
			if(termonpertence != 0 || cont0 == 0 || cont1 == 0) System.out.println("Linguagem invalida!");
			else if((cont0 % 2 == 0) && (cont1 % 2 == 0)) System.out.println("Linguagem Aprovada!");
			else System.out.println("Linguagem Invalida!");
			
		}

}
