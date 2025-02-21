public class Exercicio3$16 {
    public static void main(String[] args) {

        int termo = 20;
        long primeiro = 1;
        long segundo = 1;

        for (int i = 2; i < termo; i++) {
            long proximo = primeiro + segundo;

            System.out.printf("%d ", proximo);

            primeiro = segundo;
            segundo = proximo;

        }

    }
}
