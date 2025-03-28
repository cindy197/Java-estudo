// Atividade 1 
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor entre 1 e 1000: ");

        int x = sc.nextInt();


        while (x < 1 || x > 1000){
            System.out.println("Valor errado, digite o valor entre 1 e 10000: ");
            x = sc.nextInt();
        }


        for (int i = 1; i <= x; i ++) {
            if (i % 2 != 0) { // Vai usa o resto da divisão por 2 e verificar se é diferente de 0. Isso significa que
                // é impar, se for o contrário é par.
                System.out.println(i);
            }
        }

    }
}

// Atividade 2 
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas vezes o numero será lido:");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i ++ ) {
            System.out.println("Digite o numero: ");
            int x = sc.nextInt();
           if (x>=10 && x<=20) {
               in = in + 1;
           } else {
               out ++;
           }


        }

        System.out.println("In " + in);
        System.out.println("Out " + out);
       }
    }

//Atividade 3 

import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantidade de testes para ser lida: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a média ponderada dos 3 testes: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;


            System.out.printf( "A média é %.1f%n", media );
        }




    }
}

// Atividade 4 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o numero a ser lido: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Digite os numeros: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossivel!");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);

            }
        }

    }
}

// Atividade 5 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor n: ");
        int n = sc.nextInt();

        int fat = 1;

        for (int i = n; i >=1; i--) {
            fat = fat * i;
        }
        System.out.println("Fatorial de N é: " + fat);

    }
}

// Atividade 6 
