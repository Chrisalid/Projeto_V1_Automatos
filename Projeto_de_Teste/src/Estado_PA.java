public class Estado_PA implements EcommerceState {
	//metodo de mudança de estado que retorna uma mudança de estado para o Estado de Pedido em Transporte
	public EcommerceState irParaPT() {
		System.out.println("Seu pedido está em transporte!");
		return new Estado_PT();
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
		System.out.println("Seu pedido já foi aceito!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPE() {
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
