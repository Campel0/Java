import java.util.Scanner;

public class Exercicio2$4 {
    
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        int n1;
        int n2;
        int n3;

        System.out.print( "N1: " );
        n1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "N2: " );
        n3 = Integer.parseInt( scan.nextLine() );

        System.out.print( "N3: " );
        n2 = Integer.parseInt( scan.nextLine() );

        // Ordenando os números em ordem crescente

        // Se n1 for maior que n2, trocamos os valores para garantir que n1 seja o menor entre os dois
        if( n1 > n2 ){
            int temp = n1; // Armazena o valor de n1 temporariamente
            n1 = n2;       // Atribui o valor de n2 a n1
            n2 = temp;     // Atribui o valor original de n1 a n2
        }

        // Se n1 for maior que n3, trocamos os valores para garantir que n1 seja o menor entre os três
        if( n1 > n3 ){
            int temp = n1; // Armazena o valor de n1 temporariamente
            n1 = n3;       // Atribui o valor de n3 a n1
            n3 = temp;     // Atribui o valor original de n1 a n3
        }

        // Se n2 for maior que n3, trocamos os valores para garantir que n2 seja menor que n3
        if( n2 > n3 ){
            int temp = n2; // Armazena o valor de n2 temporariamente
            n2 = n3;       // Atribui o valor de n3 a n2
            n3 = temp;     // Atribui o valor original de n2 a n3
        }

        // Agora, os valores estão ordenados em ordem crescente: n1 <= n2 <= n3

        System.out.printf("%d <= %d <= %d", n1, n2, n3);

        scan.close();

    }
}
