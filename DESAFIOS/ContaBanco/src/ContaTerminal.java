import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Por favor, digite o seu Nome: ");
        conta.nomeCliente = scan.next();
        System.out.println("Por favor, digite o número da Agência: ");
        conta.agencia = scan.next();
        System.out.println("Por favor, digite o número da Conta: ");
        conta.numero = scan.nextInt();
        System.out.println("Por favor, digite o Saldo da Conta: ");
        conta.saldo = scan.nextDouble();
        System.out.println("Olá "+conta.nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+conta.numero+" e seu saldo "+conta.saldo+" já está disponível para saque.");
        scan.close();
    }
}
