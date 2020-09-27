
public class Estado_PF implements EcommerceState{
	//metodo de mudança de estado que retorna uma mudança de estado para Pedido Novo
	public EcommerceState irParaPN() {
		System.out.println("Você fará um novo pedido!");
		return new Estado_PN();
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
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPF() {
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPC() {
		System.out.println("Ação indisponível!");
		return null;
	}
	//metodo de mudança de estado que retorna null
	public EcommerceState irParaPR() {
		System.out.println("Ação indisponível!");
		return null;
	}

}
