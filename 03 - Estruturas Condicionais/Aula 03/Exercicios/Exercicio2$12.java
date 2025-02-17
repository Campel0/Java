import java.util.Scanner;

public class Exercicio2$12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int homem1;
        int homem2;
        int mulher1;
        int mulher2;

        System.out.print( "Idade Homem 1: " );
        homem1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Idade Homem 2: " );
        homem2 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Idade Mulher 1: " );
        mulher1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Idade Mulher 2: " );
        mulher2 = Integer.parseInt( scan.nextLine() );

        // verifica quem é o mais velho/novo

        int homemMaisVelho;
        int homemMaisNovo;

        if ( homem1 > homem2  ){
            homemMaisVelho = homem1;
            homemMaisNovo = homem2;
        }
        else{
            homemMaisVelho = homem2;
            homemMaisNovo = homem1;
        }

        // verifica quem é a mais velha/nova

        int mulherMaisVelha;
        int mulherMaisNova;

        if ( mulher1 > mulher2 ){
            mulherMaisVelha = mulher1;
            mulherMaisNova = mulher2;
        }
        else{
            mulherMaisVelha = mulher2;
            mulherMaisNova = mulher1;
        }

        // calculando

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.printf( "Idade homem mais velho + idade mulher mais nova: %d\n", soma );
        System.out.printf( "Idade homem mais novo * idade mulher mais velha: %d\n", produto );

        scan.close();

    }
}
