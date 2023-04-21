public class Poupanca extends Conta{

    @Override
    public void mostrarSaldo() {
        double saldoComRendimento = getSaldo() * 1.005;
        System.out.println("Saldo com rendimento de 0,5%: R$" + saldoComRendimento);
    }

}
