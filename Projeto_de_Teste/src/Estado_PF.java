
public class Estado_PF implements EcommerceState{
	//metodo de mudan�a de estado que retorna uma mudan�a de estado para Pedido Novo
	public EcommerceState irParaPN() {
		System.out.println("Voc� far� um novo pedido!");
		return new Estado_PN();
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPgF() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPA() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPT() {
		System.out.println("A��o indispon�vel!");
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
	public EcommerceState irParaPC() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPR() {
		System.out.println("A��o indispon�vel!");
		return null;
	}

}
