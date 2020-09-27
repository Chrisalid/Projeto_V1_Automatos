
public class Estado_PgF implements EcommerceState{
	//metodo de mudan�a de estado que retorna uma troca de estado para Pedido Aceito
	public EcommerceState irParaPA() {
		System.out.println("Seu pedido foi aceito!");
		return new Estado_PA();
	}
	//metodo de mudan�a de estado que retorna uma troca de estado para Pedido Cancelado
	public EcommerceState irParaPC() {
		System.out.println("Seu foi cancelado!");
		return new Estado_PC();
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPN() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
	//metodo de mudan�a de estado que retorna null
	public EcommerceState irParaPgF() {
		System.out.println("Seu pedido j� foi pago!");
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
	public EcommerceState irParaPR() {
		System.out.println("A��o indispon�vel!");
		return null;
	}
}
