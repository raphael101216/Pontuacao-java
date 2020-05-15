import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		char formaPagamento;
		int quantCompra, inadimplencia, ScorevolumeCompras  = 0 , scoreInadimplencia  = 0 , scoreFormaPagamento  = 0, classificacaoFinal, scoreTotal;
		double tiketMedio;
		
		// Cabe�alho

				System.out.println("SISTEMA DE PERFIL DE CLIENTE");
				System.out.println("--------------------------------");
				System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		
		//Leitura do volume
				
				System.out.println();
				System.out.print("Quantas compras o cliente fez no �ltimo ano?");
				quantCompra = sc.nextInt();
				System.out.print("Qual o ticket m�dio?");
				tiketMedio = sc.nextDouble();
				
		//Leitura dos outros dados
				
				System.out.println();
				System.out.print("Quantas vezes o cliente atrasou o pagamento?");
				inadimplencia = sc.nextInt();
				System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)?");
				formaPagamento = sc.next().charAt(0);
	
	    //Score de volume de compras
				
				if(quantCompra < 0) {
					
					ScorevolumeCompras = 0;
				}else if (quantCompra <= 2 && tiketMedio <= 3000.00) {
					
					ScorevolumeCompras = 20;
				}else if(quantCompra > 2 && tiketMedio <= 3000.00 ) {
					
					ScorevolumeCompras = 40;
				}else if(tiketMedio > 3000.00) {
					ScorevolumeCompras = 60;
				}
	
				System.out.println();
				System.out.print("Score de volume de compras = " + ScorevolumeCompras + " pontos");
				System.out.println();
		// Score de inadimplencia e pagamento
				
				if(inadimplencia > 1 || quantCompra < 0 ) {
					
					scoreInadimplencia = 0;
				}else if(inadimplencia == 1 && quantCompra > 0 ) {
					
					scoreInadimplencia = 15;
				}else if(inadimplencia < 0 && quantCompra > 0  ) {
					
					scoreInadimplencia = 30;
				} 
				
				
				if(formaPagamento == 'D' || formaPagamento == 'd' && quantCompra > 0) {
					
					scoreFormaPagamento = 5;
					
				}else if(formaPagamento == 'C' || formaPagamento == 'c' || formaPagamento == 'B' || formaPagamento == 'b' && quantCompra > 0 ) {
					
					scoreFormaPagamento = 10;
				}
	            
				System.out.println();
				System.out.println("Score de inadimpl�ncia = " + scoreInadimplencia + " pontos");
				System.out.println("Score de forma de pagamento = " + scoreFormaPagamento + " pontos");
				
				
				// Classifica��o final
				
				scoreTotal = ScorevolumeCompras + scoreInadimplencia + scoreFormaPagamento;
				
				if(scoreTotal == 0 && scoreTotal <= 25) {
					System.out.println();
					System.out.println("Classifica��o final = CLIENTE BRONZE");
					
				}else if(scoreTotal > 25 && scoreTotal <= 75) {
					System.out.println();
					
					System.out.println("Classifica��o final = CLIENTE PRATA");
				}else if(scoreTotal > 75) {
					
					System.out.println();
					System.out.println("Classifica��o final = CLIENTE OURO");
				}
	}

}
