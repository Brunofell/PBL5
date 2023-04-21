public class Main {
    public static void main(String[] args) {

        Corrente cc = new Corrente();
        cc.depositar(1000.0);

        Poupanca cp = new Poupanca();
        cp.depositar(500.0);

        Pessoa pessoa1 = new Pessoa(cc);
        Pessoa pessoa2 = new Pessoa(cp);

        System.out.println("- Saldo da conta corrente: ");
        pessoa1.getConta().mostrarSaldo();

        System.out.println("- Saldo da poupança: ");
        pessoa2.getConta().mostrarSaldo();

        System.out.println("- Fazendo deposito nas contas: ");

        pessoa1.depositar(250.0);
        pessoa2.depositar(100.0);
        System.out.println("- Valor das contas depois do deposito: ");

        System.out.println("- Saldo da conta corrente: ");
        pessoa1.getConta().mostrarSaldo();

        System.out.println("- Saldo da conta poupança: ");
        pessoa2.getConta().mostrarSaldo();
    }
}