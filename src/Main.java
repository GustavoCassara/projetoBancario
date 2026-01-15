import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinheiro;
        int opcao = 0;
        String conta = "";
        int tipoConta = 0;

        //inserção dos dados inciais
        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        while (tipoConta != 1 && tipoConta != 2){ //seleciona um tipo de conta

            System.out.print("""
                        Selecione o tipo de Conta:
                        1 - Corrente
                        2 - Poupança
                        """);

            tipoConta = sc.nextInt();

            if (tipoConta > 2) {
                System.out.println("Opção Inválida!");
            }

            if (tipoConta < 1) {
                System.out.println("Opção Inválida!");
            }

            switch (tipoConta){
                case 1:
                    conta = "Corrente";
                    break;

                case 2:
                    conta = "Poupança";
                    break;
            }
        }

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        //mostra os dados iniciais
        System.out.printf(String.format("""
                *******************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  R$ %.2f
                *******************************************
                
                """,nome,conta,saldo));

        while (opcao != 4) { //menu
            System.out.printf(String.format("""
                    Operações
                    
                    1 - Consultar Saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                    
                    Digite a opção desejada:
                    """));

            opcao = sc.nextInt();

            if (opcao > 4){ //prevenção de possiveis erros de digitação
                System.out.println("Opção Inválida!");
                System.out.println();
            }

            if (opcao < 0){ //prevenção de possiveis erros de digitação
                System.out.println("Opção Inválida!");
                System.out.println();
            }

            switch (opcao){
                case 1: //mostra o saldo atualizado
                    System.out.printf("O seu saldo é: R$ %.2f\n",saldo);
                    System.out.println();
                    break;

                case 2: //calcula o valor de deposito no saldo
                    System.out.println("Digite o Valor a ser depositado:");
                    dinheiro = sc.nextDouble();
                    saldo += dinheiro;
                    break;

                case 3: //calcula a retirada de valor do saldo
                    System.out.println("Digite o valor a ser transferido:");
                    dinheiro = sc.nextDouble();
                    if (saldo < dinheiro){
                        System.out.println("Saldo insulficiente para transferência!");
                    }
                    else{
                        saldo -= dinheiro;
                    }
                    break;

                case 4:
                    System.out.println("Programa Encerrado");
                    break;
            }
        }
    }
}