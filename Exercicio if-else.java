//Exercicio 1 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero: ");
        int N = sc.nextInt();

        if (N > 0) {
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }


    }
}
// Exercicio 2 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int N = sc.nextInt();

        if (N >= 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

    }
}

//Exercicio 3 
import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("insira dois numeros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos!");
        }
        else {
            System.out.println("Não são multiplos!");
        }
        }
    }

// Exercicio 4
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a hora inicial e a hora final do jogo: ");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial - horaFinal;
        }
        System.out.println("O jogo durou " + duracao + " hora(s)");
    }
}
// Exercicio 5 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o codigo do produto e quantidade: ");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) { // == -> comparando
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;

        } else if (codigo == 3) {
            total = quantidade * 5.00;                   

        } else if (codigo == 4) {
            total = quantidade * 2.50;
            
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("O Total é R$ %.2f%n", + total);


    }
}

//Exercicio 6 
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Insira um numero: ");
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo!");
        } else if (numero <= 25.0) {
            System.out.println("Dentro do intervalo de [0,25]");
        } else if (numero <= 50.0) {
            System.out.println("Dentro do intervalo de [25,50]");            
        } else if (numero <= 75.0) {
            System.out.println("Dentro do intervalo de [50,75]");            
        } else {
            System.out.println("Dentro do intervalo de [75,100]");
        }

    }
}

//Exercicio 7 
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Insira um valor: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem!");
        } else if (x == 0.0) {
            System.out.println("Eixo y");
            
        } else if (y == 0.0) {
            System.out.println("Eixo x");

        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
                        
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
            
        } else {
            System.out.println("Q4");
        }

    }

}

//Exercicio 8 
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o salario");
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
            
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000 * 0.08;
            
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

        }
        if (imposto == 0.0) {
            System.out.println("Isento!");
        } else {
            System.out.printf("R$ %.2f%n", + imposto);
        }
    }
}
