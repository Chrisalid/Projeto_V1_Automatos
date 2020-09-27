/*Classe do estado inicial do objeto, onde tem-se a chamada dos métodos que iram mudar o seu estado, dependendo da chamada de 
 na classe principal, todas com retorno EcommerceState, porém se não for uma chamada valida ele retorna null*/

public class Estado_PN implements EcommerceState{

	public EcommerceState irParaPgF() {
		System.out.println("Seu pedido foi pago!");
		return new Estado_PgF();
	}
	public EcommerceState irParaPC() {
		System.out.println("Seu foi cancelado!");
		return new Estado_PC();
	}
	public EcommerceState irParaPN() {
		System.out.println("Seu pedido ja foi feito!");
		return null;
	}
	public EcommerceState irParaPA() {
		System.out.println("Ação indisponível!");
		return null;
	}
	public EcommerceState irParaPT() {
		System.out.println("Ação indisponível!");
		return null;
	}
	public EcommerceState irParaPE() {
		System.out.println("Ação indisponível!");
		return null;
	}
	public EcommerceState irParaPF() {
		System.out.println("Ação indisponível!");
		return null;
	}
	public EcommerceState irParaPR() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
