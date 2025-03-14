//Ler um texto até a quebra de linha 
import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);


        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //Para ler a linha inteira tem que por o nextLine! 

  //Atenção: Quebra de linha pendente 
 
        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3); 
  //Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente"
  //na entrada padrão. Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine(). Ou seja, para corrigir 
  // é feito da seuinte forma: Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.
