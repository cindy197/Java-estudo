// While (enquanto) 
// Repete bloco de comandos enquanto uma condição for verdadeira. 
// Utilizado quando NÃO se sabe previamente a quantidade de repetições que sera realizadas.
// Sintaxe 
while (condição) { // -> se for verdadeira vai ser executado e voltar! 
  comando 1
    comando 2 
    } 
//Regra: V -> executa e volta F -> pula! 

import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) { // ele lerá numeros enquanto o X for diferente de 0 !
            x = sc.nextInt();
        }
    }
}
while (x != 0) { // ele lerá numeros enquanto o X for diferente de 0 !
            soma = soma + x; // essa variavel acumula os valores! 
            x = sc.nextInt();
