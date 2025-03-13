// Verificação de Divisibilidade por 4 com Loop For

 class Exercicio3$10 {
    public static void main(String[] args) {

        // fazemos o laço para percorrer de 45 até 60
        // e caso o número percorrido seja divisivel/indivisivel por 4 ele ira imprimir

        for(int i = 45 ; i <= 60; i++){
            if(i % 4 == 0)
            {
                System.out.printf("%d: divisivel\n", i);
            }
            else
            {
                System.out.printf("%d: indivisivel\n", i);
            }
        }

    }
}
