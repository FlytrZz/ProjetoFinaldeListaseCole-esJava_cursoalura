package Lista;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Digite o limite do cartão:");
		double lim = input.nextDouble();
		prod p = new prod(lim);
		
		int sair = 1;
		while(sair!= 0) {
		System.out.println("Digite a descrição da compra:");
		String descriçao = input2.nextLine();
		
		System.out.println("Digite o valor da compra:");
		double valor = input.nextDouble();
		
		Compra compra = new Compra(descriçao,valor);
		boolean compraRealizada = p.lançarCompra(compra);
		
			if(compraRealizada) {
				System.out.println("Compra realizada!");
				System.out.println("Digite 0 para sair ou 1 para continuar");
				sair = input.nextInt();
			} else {
				System.out.println("Saldo insuficiente!");
				sair = 0;
			}
		}
		
		System.out.println("*********************");
		System.out.println("COMPRAS REALIZADAS:");
		System.out.println("");
		Collections.sort(p.getCompras());
		for(Compra c: p.getCompras()) {
			System.out.println(c.getDescriçao()+" - "+c.getValor());
		}
		System.out.println("");
		System.out.println("*********************");
		System.out.println("");
		System.out.println("Saldo do cartão: "+p.getSaldo());
	}
}

