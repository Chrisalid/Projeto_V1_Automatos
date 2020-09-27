
public class Estado_PE implements EcommerceState {
	//metodo de mudança de estado que retorna uma mudança de estado para Pedido Finalizado
	public EcommerceState irParaPF() {
		System.out.println("Seu pedido foi finalizado!");
		return new Estado_PF();
	}
	//metodo de mudança de estado que retorna uma mudança de estado para Pedido Reembolsado
	public EcommerceState irParaPR() {
		System.out.println("Seu foi reembolsado!");
		return new Estado_PR();
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPN() {
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPgF() {
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPA() {
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPT() {
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPE() {
		System.out.println("Seu pedido já foi entregue!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPC() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
