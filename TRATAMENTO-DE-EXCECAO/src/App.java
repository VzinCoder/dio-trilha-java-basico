import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        boolean dadosErrados = true;
        do{
            try{
                System.out.println("Digite seu nome: ");
                String nome = scan.next();
        
                System.out.println("Digite sua idade");
                int idade = scan.nextInt();
        
                System.out.println("Digite sua altura");
                double altura = scan.nextDouble();

                dadosErrados = false;

                System.out.println("Vc se chama "+nome+" tem "+idade+" anos"+" e tem "+altura+" de altura");
            }catch(InputMismatchException err){
                System.out.println("Entrada Invalida Digite Novamente!");
                scan.nextLine();
            }
        }while(dadosErrados);


        scan.close();
        

    }
}
