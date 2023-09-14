public class Repeticao {
    public static void main(String[] args){
        
        int numero = 5;

        // (Incremento)
        numero++; /*: numero = numero + 1; (Resultado = 6) */

        /* Decremento */
        numero-- /*: numero = numero -1 (Resultado = 5)*/;
        
        System.out.println(numero);

        /* Invertendo valor de variavel do tipo boolean */
        boolean variavel = true;
        System.out.println("Variável " + !variavel); /* ! = operador para inverter o valor boolean de uma variavel ou condição 
        ou seja, se algo é verdadeiro passa a ser falso e vice e versa, mas neste exemplo ela atribuiu este valor
        falso, apenas no print mas nao no valor original da variavel, para inverter seu valor de forma definitiva,
        devemos atribuir esse opeador na proxima declaração da variável. */
        
        System.out.println(variavel); /* Perceba que a variavel continua com seu valor inicial (verdadeiro) */

        variavel = !variavel; /* Após atribui o sinal de inversão, no proximo print, seu valor ja teria sido
        mudado de forma definitiva ate uma proxima atribuição */

        System.out.println(variavel);
    }  
}
