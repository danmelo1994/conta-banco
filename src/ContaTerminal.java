import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Por favor, digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Por favor, digite o sua ag�ncia: ");
		String agencia = sc.next();
		
		System.out.print("Por favor, digite o seu n�mero da conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Por favor, digite o seu saldo da conta: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Ol� "+ nome + ", obrigado por criar uma conta em nosso banco, "
							+ "sua ag�ncia � "+ agencia + ", conta "+ conta + " e seu saldo "
									+ "de R$ " + saldo + " j� est� dispon�vel para saque.");
	}

}
