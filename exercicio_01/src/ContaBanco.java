import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBanco {
    static Scanner sc = new Scanner(System.in);

    static int numeroDaConta;
    static String agencia;
    static String nomeDoCliente;
    static BigDecimal saldo;

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo ao ContaBanco - DIO");
        System.out.println("Vamos criar sua conta, digite o seu nome: ");
        nomeDoCliente = sc.nextLine();

        System.out.println("Agora digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Numero da conta, 4 digitos: ");
        numeroDaConta = sc.nextInt();

        System.out.println("Quanto deseja depositar inicialmente: ");
        saldo = sc.nextBigDecimal();

        System.out.println("Olá´" + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + "já está disponivel para saque.");
    }
}
