
public class Estado_PT implements EcommerceState {
	//metodo de mudança de estado que retorna uma mudança de estado para o Estado de Pedido Entregue
	public EcommerceState irParaPE() {
		System.out.println("Seu pedido foi entregue!");
		return new Estado_PE();
	}
	//metodo de mudança de estado que retorna uma troca de estado para Pedido Cancelado
	public EcommerceState irParaPC() {
		System.out.println("Seu pedido foi cancelado!");
		return new Estado_PC();
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
	public EcommerceState irParaPF() {
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPR() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
