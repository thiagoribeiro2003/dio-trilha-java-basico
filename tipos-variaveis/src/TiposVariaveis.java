public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //estudem a classe String que representa texto na aplicação

        String meuNome = "Thiago Ribeiro";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Alterando valor de variável
        int numero = 5;
        numero = 10;

        System.out.println(numero);

        /* Para criarmos uma variável como uma constante precisamos que na declaração dela 
        o nome da variável seja todo maiúsculo e tenha a palavra 'final' antes do tipo */
        final double VALOR_DE_PI = 3.14;

        String nomeCompleto = "Thiago " + "Ribeiro Lopes da Silva";
        System.out.println(nomeCompleto);
        
    }
}
