import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = scan.nextInt();

        try {
            contar(parametro1,parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        

        scan.close();
    }


    public static void contar(int parametro1,int parametro2)throws ParametrosInvalidosException{
        int diferenca = parametro2 - parametro1;

        if(diferenca <= 0){
            throw new ParametrosInvalidosException();
        }

        for(int i = 0;i<diferenca;i++){
            System.out.println("Imprimindo o número "+(i+1));
        }
    }
}
