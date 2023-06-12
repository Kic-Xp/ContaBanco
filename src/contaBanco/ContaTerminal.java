package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		System.out.println("Digite o número da Conta:");
		numero = sc.nextInt();
		System.out.println("Digite a agencia da Conta:");
		agencia = sc.next();
		System.out.println("Digite o nome do cliente da Conta:");
		nomeCliente = sc.next();
		System.out.println("Digite o saldo da Conta:");
		saldo = sc.nextDouble();
		
		System.out.println("Olá "+nomeCliente+" por criar uma conta em nosso banco, "
				+ "sua agencia é "+agencia+", conta "+numero+" e seu saldo é "+saldo);
	}
}
