public class Tela {

    void tipoConta(){ //seleciona o tipo de conta
        System.out.print("""
                        Selecione o tipo de Conta:
                        1 - Corrente
                        2 - Poupança
                        """);
    }

    void operacoes(){//menu de operações
        System.out.print("""
                    Operações
                    
                    1 - Consultar Saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                    
                    Digite a opção desejada:
                    """);

    }
}