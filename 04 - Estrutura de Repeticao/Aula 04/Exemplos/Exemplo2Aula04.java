package Exemplos;

public class Exemplo2Aula04 {
    public static void main(String[] args) {

        /*
         * Os operadores de incremento ( ++ ) e decremento ( -- )
         * são usados para aumentar ou diminuir um valor em 1.
         */

        int numero = 5;
        System.out.println(numero++); // Pós-fixado: imprime 5 e depois incrementa
        System.out.println(numero); // Agora numero vale 6

        int numero2 = 5;
        System.out.println(++numero2); // Pré-fixado: incrementa antes e imprime 6

    }
}
