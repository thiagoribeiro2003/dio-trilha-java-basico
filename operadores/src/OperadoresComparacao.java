public class OperadoresComparacao {
    public static void main(String[] args) {

        /* COMPARANDO STRINGS */

        String nomeUm = "Thiago";
        String nomeDois = new String("Thiago");

        // Usamos a função .equals para comparar o conteúdo de Strings e Objetos
        System.out.println(nomeUm.equals(nomeDois));

        /* COMPARANDO NÚMEROS */

        int numero1 = 1;
        int numero2 = 2;

        /* Comparando se são iguais */
        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é IGUAL a numero2? " + simNao);
        
        /* Comparando se são diferentes */
        simNao = numero1 != numero2;
        System.out.println("numero1 é DIFERENTE de numero2? " + simNao);

        /* Comparando se um é maior que o outro */
        simNao = numero1 > numero2;
        System.out.println("numero1 é MAIOR que numero2? " + simNao);

        /* Comparando se um é menor que o outro */
        simNao = numero1 < numero2;
        System.out.println("numero1 é MENOR que numero2?" + simNao);
        
    }
}
