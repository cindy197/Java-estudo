import java.util.Locale;


public class Main {

    public static void main (String[] args){
        String product1 = "Computer";
        String product2 = "Office desk";


        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Impressão na tela

        System.out.printf(" Produto : %n %s, which price is R$ %.2f", product1, price1);
        System.out.printf("%n %s, which price is R$ %.2f", product2, price2);
        System.out.printf("%n Record : %d years old, code %d and gender %s", age, code, gender);
        System.out.printf("%n Measue with eight decimal places: %.8f %n Rouded: %.3f", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.2f", measure);



    }
}
