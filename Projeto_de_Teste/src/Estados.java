// Classe Estados onde ela executa as ações de mudança de Estados todas sem retorno(void)
/*Estados que o automato pode assumir
  PN: Pedido Novo, PgF: Pagamento Feito, PA: Pedido Aceito, PT: Pedido em Transporte
  PE: Pedido Entregue, PF: Pedido Finalizado, PC: Pedido Cancelado, PR: Pedido Reembolsado*/
public class Estados {
	
	protected EcommerceState estado;
	
	public Estados() {estado = new Estado_PN();}
	
	public void irParaPN() {this.estado = estado.irParaPN();}
	public void irParaPgF() {this.estado = estado.irParaPgF();}
	public void irParaPA() {this.estado = estado.irParaPA();}
	public void irParaPT() {this.estado = estado.irParaPT();}
	public void irParaPE() {this.estado = estado.irParaPE();}
	public void irParaPF() {this.estado = estado.irParaPF();}
	public void irParaPC() {this.estado = estado.irParaPC();}
	public void irParaPR() {this.estado = estado.irParaPR();}

}
