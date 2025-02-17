import java.util.Scanner;

public class Exercicio1$21 {

    public static void main(String[] args) {
        
        // int n1 = 1992;
        int n1;
        
        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com o ano: " );
        n1 = Integer.parseInt( scan.nextLine() );

        int sucessor = n1 + 1;
        int antecessor = n1 - 1;

        System.out.printf( "Sucessor de %d: %d\n", n1, sucessor );
        System.out.printf( "Antecessor de %d: %d", n1, antecessor );

        scan.close();

    }
    
}
