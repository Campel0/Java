public class Exemplo4Aula02 {

    public static void main(String[] args) {
        
        int inteiro1 = 10;
        int inteiro2 = 4;
        double decimal1 = 10;
        double decimal2 = 4;

        int divisaoInteira = inteiro1 / inteiro2;
        double divisaoDecimal = decimal1 / decimal2;

        System.out.printf( "%d / %d = %d\n", inteiro1, inteiro2, divisaoInteira );
        System.out.printf( "%.2f / %.2f = %.2f\n", decimal1, decimal2, divisaoDecimal );

    }
}