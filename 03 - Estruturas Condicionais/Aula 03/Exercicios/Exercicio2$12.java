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

        // Determinar quem é o homem mais velho e o mais novo
        int homemMaisVelho;
        int homemMaisNovo;

        // Compara as idades dos dois homens
        if ( homem1 > homem2  ) {
            homemMaisVelho = homem1;  // Se homem1 for mais velho, ele recebe essa variável
            homemMaisNovo = homem2;   // homem2 é o mais novo
        }
        else {
            homemMaisVelho = homem2;  // Se homem2 for mais velho, ele recebe essa variável
            homemMaisNovo = homem1;   // homem1 é o mais novo
        }

        // Determinar quem é a mulher mais velha e a mais nova
        int mulherMaisVelha;
        int mulherMaisNova;

        // Compara as idades das duas mulheres
        if ( mulher1 > mulher2 ) {
            mulherMaisVelha = mulher1;  // Se mulher1 for mais velha, ela recebe essa variável
            mulherMaisNova = mulher2;   // mulher2 é a mais nova
        }
        else {
            mulherMaisVelha = mulher2;  // Se mulher2 for mais velha, ela recebe essa variável
            mulherMaisNova = mulher1;   // mulher1 é a mais nova
        }

        // Realizando os cálculos pedidos
        int soma = homemMaisVelho + mulherMaisNova;  // Soma do homem mais velho com a mulher mais nova
        int produto = homemMaisNovo * mulherMaisVelha; // Produto do homem mais novo com a mulher mais velha


        System.out.printf( "Idade homem mais velho + idade mulher mais nova: %d\n", soma );
        System.out.printf( "Idade homem mais novo * idade mulher mais velha: %d\n", produto );

        scan.close();

    }
}
