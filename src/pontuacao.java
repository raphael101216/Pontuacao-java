import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int quantCompra, inadimplencia, formaPagamento, ScorevolumeCompras, scoreInadimplencia, scoreFormaPagamento, classificacaoFinal;
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
	}

}
