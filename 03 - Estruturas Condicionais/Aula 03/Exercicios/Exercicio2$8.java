import java.util.Scanner;

public class Exercicio2$8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        double n1;
        double n2;
        double n3;

        System.out.print( "N1: " );
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.print( "N2: " );
        n2 = Double.parseDouble( scan.nextLine() );

        System.out.print( "N3: " );
        n3 = Double.parseDouble( scan.nextLine() );

        double soma;

        // Vai fazer a soma dos dois maiores numeros.
        if( n1 <= n2 && n1 <= n3 ) // o operador && é usado para caso as duas entradas sejam verdadeiras
            // se n1 for menor ou igual que n2 E n1 for menor ou igual que n3 executara a primeira condição
        {
            soma = n3 + n2; // executara essa soma de acordo com a condição
        }
        else if( n2 <= n1 && n2 <= n3 ) // se n2 for menor ou igual a n1 E n2 for menor ou igual a n3 executara a condição
        {
            soma = n1 + n3; // executado de acordo com a condição
        }
        else{
            soma = n2 + n1; // se não executa essa soma
        }

        System.out.printf("A soma dos dois numeros maiores fornecidos e %.2f\n", soma);

        scan.close();

    }
    
}
