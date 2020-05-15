import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char formaPagamento;
		int quantCompra, inadimplencia, ScorevolumeCompras  = 0 , scoreInadimplencia  = 0 , scoreFormaPagamento  = 0, classificacaoFinal;
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
	
	    //Score de volume de compras
				
				if(quantCompra < 0) {
					
					ScorevolumeCompras = 0;
				}else if (quantCompra == 1 && tiketMedio <= 3000.00) {
					
					ScorevolumeCompras = 20;
				}else if(quantCompra > 2 && tiketMedio <= 3000.00 ) {
					
					ScorevolumeCompras = 40;
				}else if(tiketMedio > 3000.00) {
					ScorevolumeCompras = 60;
				}
	
				System.out.println();
				System.out.print("Score de volume de compras = " + ScorevolumeCompras + " pontos");
	
	}

}
