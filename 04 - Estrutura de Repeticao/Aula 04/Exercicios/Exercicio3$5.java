package Exercicios;

import java.util.Scanner;

public class Exercicio3$5 {
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero: ");
        numero = Integer.parseInt(scan.nextLine());

            if (numero < 0){
                System.out.print("Valor incorreto (negativo)");
            }
            else{
               for (int i = 0; i <= numero; i++){
                   System.out.printf("%d ", i);
               }
            }


    }
}
