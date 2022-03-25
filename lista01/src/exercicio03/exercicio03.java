package exercicio03;

import java.util.Scanner;

//Fa�a um programa para pagamento de comiss�o de vendedores de pe�as, levando-se em considera��o que sua 
//comiss�o ser� de 5% do total da venda e que voc� tem os seguintes dados: 
//- Identifica��o do vendedor 
//- C�digo da pe�a 
//- Pre�o unit�rio da pe�a 
//- Quantidade vendida

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID Vendedor: ");
		int id = sc.nextInt();
		System.out.print("COD Item: ");
		int cod = sc.nextInt();
		System.out.print("Pre�o UNID: ");
		double unid = sc.nextDouble();
		System.out.print("Quantidade vendida: ");
		int qntVend = sc.nextInt();
		System.out.println();
		double totalVenda = unid * qntVend;
		double comissao = 0.05;
		
		System.out.println("==== Comiss�o ====");
		double sum = totalVenda * comissao;
		System.out.println("Total comiss�o R$ "+String.format("%.2f", sum));
		
		sc.close();
	}

}
