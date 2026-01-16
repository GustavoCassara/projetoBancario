import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tela tela = new Tela();

        double dinheiro;
        int opcao = 0;
        int tipoConta = 0;

        //inserção dos dados inciais
        System.out.print(""" 
                Digite os dados do cliente:
                Nome:\s""");
        tela.cliente.setNome(sc.nextLine());

        while (tipoConta != 1 && tipoConta != 2){ //seleciona um tipo de conta

            //seleciona o tipo de conta
            tela.tipoConta();

            tipoConta = sc.nextInt();

            switch (tipoConta){
                case 1:
                    tela.cliente.conta = "Corrente";
                    break;

                case 2:
                    tela.cliente.conta = "Poupança";
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
            }
        }

        System.out.print("Saldo inicial: ");
        tela.cliente.saldo = sc.nextDouble();
        System.out.println();

        //exibe o menu de dados iniciais
        tela.dadosIniciais();

        while (opcao != 4) { //menu
            //menu de operações
            tela.operacoes();

            opcao = sc.nextInt();

            switch (opcao){
                case 1: //mostra o saldo atualizado
                    System.out.printf("O seu saldo é: R$ %.2f\n",tela.cliente.saldo);
                    System.out.println();
                    break;

                case 2: //calcula o valor de deposito no saldo
                    System.out.println("Digite o Valor a ser depositado:");
                    dinheiro = sc.nextDouble();
                    tela.cliente.saldo += dinheiro;
                    break;

                case 3: //calcula a retirada de valor do saldo
                    System.out.println("Digite o valor a ser transferido:");
                    dinheiro = sc.nextDouble();
                    if (tela.cliente.saldo < dinheiro){
                        System.out.println("Saldo insulficiente para transferência!");
                    }
                    else{
                        tela.cliente.saldo -= dinheiro;
                    }
                    break;

                case 4:
                    System.out.println("Programa Encerrado");
                    break;

                default:{
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
                }
            }
        }
    }
}