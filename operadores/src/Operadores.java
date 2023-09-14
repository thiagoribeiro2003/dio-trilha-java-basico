import java.sql.Date;

public class Operadores {
    public static void main(String[] args) {
        
        //Operadores de atribuição = 
        String nome = "Thiago";
        int idade = 19;
        double peso = 75.0;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(idade);

        /* Concatenação */
        
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        //Qual o resultado das expressoes abaixo?

       /* 
       String concatenacao ="?"; 

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao)
        ;*/

        /* Operadores matemáticos */
        
        int numero = 5;
 
        numero = -numero; // Transformando o valor da variavel em negativo

        System.out.println(numero);
        
        numero =  numero * -1; // Transformando o valor da variável em positivo

        System.out.println(numero);
        
    }
}
