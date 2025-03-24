// Estrutura condicional
// É uma estrutura de controle que permite definir que um certo bloco de comandos somente será executado
//dependendo de uma condição

public class Main {
    public static void main (String[] args) {
        int x = 5;
        System.out.println("Bom dia!");
        if (x > 0) { //Insere a condição, que pode ser comparativa ou lógica
            System.out.println("Boa tarde!");
        } // Entre chaves é colocado o bloco de comandos.
        System.out.println("Boa noite!");


        // Regra:
        // Se for verdadeiro ele executa o bloc de comandos, se for falso ele pula!

        //Estrutura simples:
        //if ( <condição> ) {
        //     <comando 1>
        //     <comando 2>
        // }

        //Estrutura composta
        //if ( <condição> ) {
        //       <comando 1>
        //            <comando 2>
        //                     }
        //       else {
        //          <comando 3>
        //           <comando 4>
       // }

        //REGRA:
        //V: executa somente o bloco do if
        //F: executa somente o bloco do else (se não) 
    }
}
