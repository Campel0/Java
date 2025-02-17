import java.util.Scanner;

public class Exercicio1$22 {

    public static void main( String[] args ) {
        
        // double produto = 5.79;
        double produto;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com o valor do produto: " );
        produto = Double.parseDouble( scan.nextLine() );

        double desconto = produto * ( 9.0 / 100 );
        double precoFinal = produto - desconto;

        System.out.printf(" Preco de venda com 9%% de desconto: %.2f", precoFinal );

        scan.close();

    }
    
}
