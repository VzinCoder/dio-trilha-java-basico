public class App {
    public static void main(String[] args) throws Exception {

        int numero;
        // condicional simples

        numero = 2;

        if (numero % 2 == 0) {
            System.out.println("é par");
        }

        // condicional composta

        numero = 53;

        if (numero % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }

        // condicional encadeada

        numero = 300;

        if (numero >= 0 && numero <= 99) {
            System.out.println("o numero " + numero + " esta entre 0 e 99");
        } else if (numero >= 100 && numero <= 1000) {
            System.out.println("o numero " + numero + " esta entre 100 e 1000");
        } else {
            System.out.println("o numero " + numero + " é maior que 1000");
        }

        // condicional ternaria

        numero = 2;
        String resultado = numero % 2 == 0 ? "é par" : "é impar";
        System.out.println(resultado);


        numero = 1001;

        resultado = numero >= 0 && numero <= 99? "o numero " + numero + " esta entre 0 e 99": numero >= 100 && numero <= 1000 ? "o numero " + numero + " esta entre 100 e 1000": "o numero " + numero + " é maior que 1000";
        System.out.println(resultado);

        // switch case

        int dia = 3; 

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

    }
}
