// Para -> For 
// Repete um bloco de comandos paa um certo intervalo de valores
// Usado quando se sabe peviamente a quantidade de repetições ou intevalo de valores

// Sintaxe 
for (inicio ; comando; incremento) {
  < comando 1> 
    < comando 2> 
    } 
inicio -> executa somente a primeia vez 
    comando -> V : exec e volta | F: pula fora 
      incremento -> executa toda vez depois de voltar. 

    // Otimo para fazer repetição baseado em contagem! 
    import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i = i+1) { // Aqui o i pode ficar assim i++ 
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
    }
}
