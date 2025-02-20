package Exemplos;

public class Exemplo3Aula04 {
    public static void main(String[] args) {

        // Outras considerações: Situação de Uso e Laços infinitos

        /*
         * Situação de Uso
         *
         * for → Quando sabemos exatamente quantas vezes o loop deve ocorrer.
         *
         * while → Quando a repetição depende de uma condição que pode mudar dinamicamente.
         *
         * do-while → Quando queremos garantir pelo menos uma execução.
         *
         */

        // Laços Infinitos
        // Um laço infinito acontece quando a condição de parada nunca é alcançada.

        while (true){
        System.out.println("Isso nunca para!");}

    }
}
