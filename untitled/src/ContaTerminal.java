import java.util.Scanner;
public class ContaTerminal {
    public Conta usuario_teste = new Conta(1021, "076-1", "MARIO ANDRADE", 237.48);
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco SUSU");
        System.out.print("Por favor, digite o número da sua agencia.");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da sua conta.");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, Digite o seu nome.");
        String nome = scanner.nextLine();
        System.out.println("Informe seu saldo:");
        double saldo = scanner.nextDouble();

        Conta new_user = new Conta(numero, agencia, nome, saldo);

        System.out.println("Olá " + new_user.getCliente() + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é: " + new_user.getAgencia() + ", conta: " + new_user.getNumero() + " e seu saldo: " +
                new_user.getSaldo() + " já está disponivel para saque.");

    }
}
