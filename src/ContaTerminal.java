import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Por favor, digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Por favor, digite o sua agência: ");
		String agencia = sc.next();
		
		System.out.print("Por favor, digite o seu número da conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Por favor, digite o seu saldo da conta: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, "
							+ "sua agência é "+ agencia + ", conta "+ conta + " e seu saldo "
									+ "de R$ " + saldo + " já está disponível para saque.");
	}

}
