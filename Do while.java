O Bloco de comandos é executado pelo menos uma vez, pois a condição é verificada no final!
  Sintaxe: 
do{
  comando 1
    comando 2
    } while ( condição ) ; 

A regra é: 
  v -> volta 
  f -> pula

  // Sem usar Do While
  import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

                char resp = 's';

                while (resp != 'n') {
                    System.out.println("Digite a temperatura em celsius: ");
                    double c = sc.nextDouble();
                    double f = 9.0 * c / 5.0 + 32;
                    System.out.printf("Equivalente a Fahrenheit: %.1f%n", f);
                    System.out.print("Deseja repetir (s/n) ? ");
                    resp = sc.next().charAt(0);
                }


    }
}

// Usando do While 
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

                char resp;

                do {
                    System.out.println("Digite a temperatura em celsius: ");
                    double c = sc.nextDouble();
                    double f = 9.0 * c / 5.0 + 32;
                    System.out.printf("Equivalente a Fahrenheit: %.1f%n", f);
                    System.out.print("Deseja repetir (s/n) ? ");
                    resp = sc.next().charAt(0);
                } while (resp != 'n');


    }
}
  
