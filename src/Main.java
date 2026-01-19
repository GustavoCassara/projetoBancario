import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tela tela = new Tela();
        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        //double dinheiro;
        byte opcao = 0;
        byte tipoConta = 0;

        //inserção dos dados inciais
        System.out.print(""" 
                Digite os dados do cliente:
                Nome:\s""");
        cliente.setNome(sc.nextLine());

        while (tipoConta != 1 && tipoConta != 2) { //seleciona um tipo de conta

            //seleciona o tipo de conta
            tela.tipoConta();

            tipoConta = sc.nextByte();

            switch (tipoConta) {
                case 1:
                    cliente.setConta("Corrente");
                    break;

                case 2:
                    cliente.setConta("Poupança");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
            }
        }

        System.out.print("Saldo inicial: ");
        conta.deposita(sc.nextDouble());
        System.out.println();

        //exibe o menu de dados iniciais
        System.out.printf(String.format("""
                *******************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  R$ %.2f
                *******************************************\n
                """, cliente.getNome(), cliente.getTipoConta(), conta.getSaldo()));


        while (opcao != 4) { //menu
            //menu de operações
            tela.operacoes();

            opcao = sc.nextByte();

            switch (opcao) {
                case 1: //mostra o saldo atualizado
                    System.out.printf("O seu saldo é: R$ %.2f\n", conta.getSaldo());
                    System.out.println();
                    break;

                case 2: //calcula o valor de deposito no saldo
                    System.out.println("Digite o Valor a ser depositado:");
                    conta.deposita(sc.nextDouble());
                    break;

                case 3: //calcula a retirada de valor do saldo
                    System.out.println("Digite o valor a ser transferido:");
                    conta.sacar(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Programa Encerrado");
                    break;

                default: {
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
                }
            }
        }
    }
}