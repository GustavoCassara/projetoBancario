import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinheiro;
        int opcao = 0;

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Tipo de conta: ");
        String tipoConta = sc.next();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.printf(String.format("""
                *******************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  R$ %.2f
                *******************************************
                
                """,nome,tipoConta,saldo));

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
            }
        }
    }
}