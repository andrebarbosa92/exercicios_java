package exercicio02;

import java.util.Scanner;

//  Fa�a um programa que: 
//- Leia a cota��o do d�lar 
//- Leia um valor em d�lares 
//- Converta esse valor para Real 
//- Mostre o resultado

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a cota��o do D�lar: ");
		double cotDol = sc.nextDouble();
		System.out.print("Informe a quantidade de D�lar: ");
		double qntDol = sc.nextDouble();
		
		System.out.println("=== Valor convertido em Real R$ ===");
		double convert = qntDol * cotDol;
		System.out.print("Valor total R$ "+ String.format("%.2f", convert));
		
		sc.close();
	}

}
