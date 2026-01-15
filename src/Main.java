import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 3000.00;
        double dinheiro;
        int opcao = 0;

        System.out.printf(String.format("""
                *******************************************
                Dados iniciais do cliente:
                
                Nome:           Gustavo Cassará de Almeida
                Tipo de conta:  Corrente
                Saldo inicial:  R$ 3000,00
                *******************************************
                
                """));

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