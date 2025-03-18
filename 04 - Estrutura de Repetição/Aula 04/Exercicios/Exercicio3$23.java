// Cálculo da Média Aritmética de Notas com Loop For

import java.util.Scanner;

public class Exercicio3$23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // inicialização das variaveis
        double soma = 0;
        int alunos = 10;

        for (int i = 1; i <= alunos; i++) {

            System.out.printf("Nota %d: ", i);
            double nota = Double.parseDouble(scan.nextLine());
            soma += nota;

            //cada vez que passar o loop ira somar a nota e guardar na variável
        }

        double media = soma / alunos;

        System.out.printf("A media aritmetica das dez notas e: %.2f", media);

        scan.close();

    }
}
