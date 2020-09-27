
public class Questao01B extends Questoes{
	
	public void questao01B(){
		int i = 0, j, x = 0;
		char linguagem = 'a';
		
		System.out.println("Digite o valor do expoente: ");
		j = getLerteclado().nextInt();
		x = j * j;
		while(i < x){
			System.out.println(linguagem);
			i++;
		}
		System.out.println("\nLinguagem Aprovada\n");
	}

}
