import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero da semana para buscar!");
        int num = scan.nextInt();

        try {
            DiasSemana dia = DiasSemana.findDay(num);
            System.out.println(dia);
        } catch (Exception e) {
            System.out.println("Numero invalido!");
        }

        scan.close();
    }
}
