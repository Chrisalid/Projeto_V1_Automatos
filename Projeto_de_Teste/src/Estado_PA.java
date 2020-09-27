public class Estado_PA implements EcommerceState {
	//metodo de mudan�a de estado que retorna uma mudan�a de estado para o Estado de Pedido em Transporte
	public EcommerceState irParaPT() {
		System.out.println("Seu pedido est� em transporte!");
		return new Estado_PT();
	}
	//metodo de mudan�a de estado que retorna uma troca de estado para Pedido Cancelado
	public EcommerceState irParaPC() {
		System.out.println("Seu pedido foi cancelado!");
		return new Estado_PC();
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPN() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPgF() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPA() {
		System.out.println("Seu pedido j� foi aceito!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPE() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPF() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPR() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

}
