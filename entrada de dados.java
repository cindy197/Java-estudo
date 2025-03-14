import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        //Para ler uma variavel de texto sem espaço
        String x; // A string por sua vez irá guardar os dados
        x = sc.next(); // esse comando ele parou o programa e esta esperando você digitar e depois irá imprimir o valor
        // de x na tela;
        //definiu valor pra variavel string
        System.out.println("Você digitou: " + x);

  // Para ler uma variavel de numero
        int x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);

 // Para ler com numero flutuante
       double x;
       x = sc.nextDouble();
       System.out.println("Você digitou: " + x);

        //Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
        //Locale.setDefault(Locale.US);

// Para ler um caractere 
       char x; //Pega somente a primeira letra!
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);
      
// Para ler varios dados na mesma linha
       String x; //Pega somente a primeira letra!
        int y ;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
