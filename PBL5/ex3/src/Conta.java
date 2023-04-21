public class Conta {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
