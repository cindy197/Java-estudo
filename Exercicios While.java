// Exercicio 1 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 12345) {
            System.out.println("Senha incorreta!");
            senha = sc.nextInt();
        }

        System.out.println("Senha correta!");
    }
}

// Exercicio 2 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0) {
            if (x > 0 && y > 0){
                System.out.println("Primeiro!");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo!");
            }
            else if (x > 0 && y < 0){
                System.out.println("Terceiro!");
            }
            else {
                System.out.println("Quarto!");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}

// Exercicio 3 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            }
            else if (tipo ==2) {
                gasolina += 1;
            }
            else if (tipo==3) {
                diesel += 1;
            }
            tipo = sc.nextInt();
        }

        System.out.println("Muito Obrigado!");
        System.out.println("Alcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Diesel " + diesel);
    }
}
