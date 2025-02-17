import java.util.Scanner;

public class Exercicio1$24 {
    
    public static void main(String[] args) {
        
        //double aula = 20.78;
        //int quantidade = 40;
        //double desconto = 26.5;

        double aula;
        int quantidade;
        double desconto;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com o numero de aulas feitas: " );
        aula = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com a quantidade total de aulas: ");
        quantidade = Integer.parseInt( scan.nextLine() );

        System.out.print( "Digite o desconto do INSS: " );
        desconto = Double.parseDouble( scan.nextLine() );

        double totalAulas = ( aula * quantidade );
        double descontoAulas = totalAulas * ( desconto / 100 );
        double salario = totalAulas - descontoAulas;

        System.out.printf( "Salario Liquido: %.2f", salario );

        scan.close();

    }

}
