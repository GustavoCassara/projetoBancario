public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo Insulficiente!");
        }
        else {
            saldo -= valor;
        }
    }
}
