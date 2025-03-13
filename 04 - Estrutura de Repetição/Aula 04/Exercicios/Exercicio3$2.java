// Impressão de Números Pares com Loop For

public class Exercicio3$2 {
    public static void main(String[] args) {
        
        for(int i = 0; i <= 50; i++) // laço ira percorrer até que ele seja igual a 50
        {
            if(i % 2 == 0) // condição para pegar todos os números divisíveis por 2 até 50
            {
                System.out.printf("%d ", i);
            }
        }

    }
    
}
