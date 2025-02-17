import java.util.Scanner;

public class Exercicio1$23 {

    public static void main(String[] args) {
        
        // int nascimento = 1985;
        // int anoAtual = 2018;
        int nascimento;
        int anoAtual;
        
        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com o ano de nascimento: " );
        nascimento = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com o ano atual: " );
        anoAtual = Integer.parseInt( scan.nextLine() );

        int idade = anoAtual - nascimento;

        System.out.printf( "Idade aproximada: %d anos", idade);

        scan.close();

    }
    
}
