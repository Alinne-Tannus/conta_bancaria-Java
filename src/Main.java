import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        String tipoDeConta;
        double vlrConta;
        int opcao = 0;

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite seu tipo de conta: ");
        tipoDeConta = ler.nextLine();
        System.out.println("Digite o saldo da conta: ");
        vlrConta = ler.nextDouble();

        System.out.println("===================================");
        System.out.println("| Seja bem vindo(a) " + nome + "!");
        System.out.println("| Tipo de conta: " + tipoDeConta);
        System.out.println("| Saldo da conta: R$" + vlrConta);
        System.out.println("===================================");

        String menu = """
                    || Digite a opção desejada: 
                     1 - Consultar saldo da conta
                     2 - Receber valor
                     3 - Transferir valor
                     4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("O valor da conta é " + vlrConta);
            }
            else if (opcao == 2) {
                System.out.println("Digite o valor a ser recebido: ");
                double transferencia = ler.nextDouble();
                vlrConta += transferencia;
                System.out.println("Valor transferido com sucesso!");
                System.out.println("Novo saldo: " + vlrConta);
            }
            else if (opcao == 3) {
                System.out.println("Digite valor a ser transferido: ");
                double transferencia = ler.nextDouble();

                if(vlrConta < transferencia) {
                    System.out.println("Valor insuficiente!");
                } else{
                    vlrConta -= transferencia;
                    System.out.println("Valor foi transferido com sucesso!");
                    System.out.println("Novo saldo: " + vlrConta);
                }
            }
            else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}