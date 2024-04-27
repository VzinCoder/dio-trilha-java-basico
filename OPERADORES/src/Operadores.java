import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        // operador de atribuição
        int idade = 22;
        double peso = 68.5; // usamos "." para representar a parte decimal
        char sexo = 'M'; // para char usamos aspas simples
        boolean doadorOrgao = false; // usamos true e false para booleanos
        Date dataNascimento = new Date(); // usamos new para instanciar uma classe

        // operadores aritméticos

        double soma = 10.5 + 15.7;
        int subtração = 10 - 11;
        int multiplicação = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // resto
        double resultado = (10 * 7);

        String nome = "Vinicius" + " Pereira"; // concatena as duas Strings
        System.out.println(nome); // saida: Vinicius Pereira

        // unarios 

        int numero = 5;
        numero = -numero;
        System.out.println(numero); // saida -5 
        numero = numero*-1; // para deixar positivo
        System.out.println(numero); // saida 5 

        boolean gostaDePao = true;

        System.out.println(!gostaDePao);

        // incrementar
        System.out.println(numero++); // retorna o valor e depois incrementa 1
        // decrementar
        System.out.println(numero--);  // retorna o valor e depois decrementa 1

        System.out.println(numero);

        // ternario (if de uma linha)

        int a,b;

        a = 5;
        b = 6;

        /*
        if(a == 5){
            System.out.println("'a' é igual a 5");
        }else{
            System.out.println("'a' é diferente a 5");
        }
        */
        String saida = a==5 ? "'a' é igual a 5" : "'a' é diferente de 5";
        System.out.println(saida);

        
    }
}
