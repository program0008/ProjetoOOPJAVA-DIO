public class Main {
    public static void main(String[] args) {
        Cliente karina = new Cliente ();
        karina.setNome("Karina");


        Conta cc = new ContaCorrente(karina);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(karina);
        cc.transferir(100, poupanca );
       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

    }
}
