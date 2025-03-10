import java.util.Scanner;

public class Exercicio2$15 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        int idade;

        System.out.println( "Entre com sua idade: " );
        idade = Integer.parseInt( scan.nextLine() );

        // Verificação de idade para eleição
        if ( idade < 16 ) {
            System.out.println( "Nao eleitor." );
        }

        // usamor o operador E para verificar se as duas entradas são verdadeiras
        else if ( idade >= 18 && idade <= 65 ) {
            System.out.println( "Eleitor obrigatorio.");
        }

        // Para idades entre 16-17 ou maiores que 65
        else {
            System.out.println( "Eleitor facultativo." );
        }

        scan.close();
    }
}
