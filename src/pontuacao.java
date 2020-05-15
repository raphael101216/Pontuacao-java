import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char formaPagamento;
		int quantCompra, inadimplencia, ScorevolumeCompras, scoreInadimplencia, scoreFormaPagamento, classificacaoFinal;
		double tiketMedio;
		
		// Cabeçalho

				System.out.println("SISTEMA DE PERFIL DE CLIENTE");
				System.out.println("--------------------------------");
				System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		
		//Leitura do volume
				
				System.out.println();
				System.out.print("Quantas compras o cliente fez no último ano?");
				quantCompra = sc.nextInt();
				System.out.print("Qual o ticket médio?");
				tiketMedio = sc.nextDouble();
				
		//Leitura dos outros dados
				
				System.out.println();
				System.out.print("Quantas vezes o cliente atrasou o pagamento?");
				inadimplencia = sc.nextInt();
				System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?");
				formaPagamento = sc.next().charAt(0);
	
	
	
	
	
	}

}
