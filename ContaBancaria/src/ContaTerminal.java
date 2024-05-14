import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();

        Scanner s = new Scanner(System.in);

        System.out.println("Qual o número da agência?");
        String agencia = s.next();

        System.out.println("Qual o número da conta?");
        int n = s.nextInt();

        System.out.println("Qual o nome do cliente?");
        String nome = s.next();

        System.out.println("Qual o saldo?");
        double saldo = s.nextDouble();

        s.close();

        conta.setAgencia(agencia);
        conta.setNumero(n);
        conta.setNome(nome);
        conta.setSaldo(saldo);

        System.out.println(conta.toString());
    }
}