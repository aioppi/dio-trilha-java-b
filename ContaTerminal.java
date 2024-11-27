
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try ( //TO DO - "Conhecer e importar a classe Scanner"
        //"Exibir as mensagens para nosso usuario"
        //"Obter pela scanner os valores difitados no terminal"
        //"Exibir a mensagem conta criada"
        //------------------------------------------------------
        // int numero; para o numero da conta.
        // String agencia; para a agencia.
        // String nomeCliente; para o nome do cliente.
        //double saldo; para o saldo.
            Scanner scanner = new Scanner(System.in)) {

            // Solicitar o numero da Conta
            System.out.println("Por favor, digite o número da Conta: ");
            int conta = scanner.nextInt();
            
            // Consumirr a quebra de linha pendente
            scanner.nextLine();
            
            // Solicitar o número da Agência
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
            
            // Solicitar o nome do Cliente
            System.out.println("Por favor, digite seu Nome: ");
            String nomeCliente = scanner.nextLine();
            
            // Solicitar Saldo Inicial
            System.out.println("Por favor, digite o Saldo Inicial: ");
            double saldo = scanner.nextDouble();

            // Exibir a mensagem final com todos os dados
            System.out.println("Olá " + nomeCliente + ", Obrigado por Criar uma conta em AGI Bank.");
            System.out.println("Sua Agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponivel para saque");


            // Fechar scanner
            scanner.close();
        }

    }
}
