package Lista;
import java.util.List;
import java.util.LinkedList;
public class prod {
private double limite;
private double saldo;
private List <Compra> compras;

public prod(double limite) {
	this.limite = limite;
	this.saldo = limite;
	this.compras = new LinkedList<>();
}
public double getLimite() {
	return limite;
}
public double getSaldo() {
	return saldo;
}
public List<Compra> getCompras() {
	return compras;
}
public boolean lançarCompra(Compra compra) {
	if(this.saldo>compra.getValor()) {
		this.saldo-=compra.getValor();
		this.compras.add(compra);
		return true;
	} else {
		return false;
	}
}
}
