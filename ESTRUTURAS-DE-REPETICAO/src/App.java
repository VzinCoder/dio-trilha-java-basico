import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // for loop

        // executa 3 vezes
        for (int count = 1; count <= 3; count++) {
            System.out.println("Executei: " + count);
        }

        // percorendo arr
        String[] nomes = { "nome1", "nome2", "nome3" };
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Elemento " + i + ": " + nomes[i]);
        }

        // for each

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // break

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Parei no " + (i));
                break;
            } else {
                System.out.println("Executei: " + (i + 1));
            }
        }

        // continue

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("pulei o 3");
                continue;
            }

            System.out.println("Executei: " + (i + 1));

        }

        // while

        int numero = 25483657;
        while(numero > 9){
            numero = numero/10;
        }

        System.out.println(numero);


        // do while

        int numeroPar;
        do{

        System.out.println("Digite um numero par!");
        numeroPar = scan.nextInt();

        }while(numeroPar %2 != 0);

        scan.close();

    }
}
