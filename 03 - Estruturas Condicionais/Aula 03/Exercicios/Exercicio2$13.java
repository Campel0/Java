import java.util.Scanner;

public class Exercicio2$13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, notaOptativa;

        System.out.println( "Nota Av. 1: ");
        nota1 = Double.parseDouble( scan.nextLine() );

        System.out.println( "Nota Av. 2: ");
        nota2 = Double.parseDouble( scan.nextLine() );

        System.out.println( "Nota Optativa: ");
        notaOptativa = Double.parseDouble( scan.nextLine() );



        /*
         *
         * Uso do Math.min para substituir a menor nota entre nota1 e nota2 pela notaOptativa.
         *
         * if( notaOptativa > Math.min(nota1, nota2) ){
         *  if( nota1 < nota2 ){
         *      nota1 = notaOptativa;
         *  }
         *   else{
         *       nota2 = notaOptativa;
         *   }
         * }
         */


        /*
         * Substituir a menor nota pela nota optativa, se for maior
         * aqui usamos os operadores logicos ( minha dificuldade )
         */

        if ( notaOptativa > nota1 && nota1 <= nota2 ){
            nota1 = notaOptativa;
        } else if ( notaOptativa > nota2 && nota2 <= nota1 ){
            nota2 = notaOptativa;
        }

        double media = ( nota1 + nota2 ) / 2;
        System.out.printf( "Media: %.2f\n", media );

        if( media >= 6.0 ){
            System.out.println( "Aprovado!" );
        }
        else if( 4.0 <= media && media < 6.00 ){
            System.out.println( "Exame." );
        }
        else if( media < 4.00 ){
            System.out.println( "Reprovado..." );
        }

    }
}
