public abstract class Conta implements IConta {

        private static final int AGENCIA_PADRAO = 1;
        private static int SEQUENCIAL = 1;
        protected int agencia;
        protected int numero;
        protected double saldo;

        protected double limiteCredito;
        protected Cliente cliente;
        protected String cpf;


        public Conta(Cliente cliente) {
                this.agencia = Conta.AGENCIA_PADRAO;
                this.numero = SEQUENCIAL++;
                this.cliente = cliente;
                this.cpf = cpf;

        }


        public void sacar(){

        }
        public void depositar(){

        }
        public void transferir(){

        }
        public Object limiteCredito(){

                return null;
        }

        @Override
        public void sacar(double valor) {
               saldo -= valor;
        }

        @Override
        public void depositar(double valor) {
              saldo += valor;
        }

        @Override
        public void transferir(double valor, Conta contaDestino) {
                this.sacar(valor);
                contaDestino.depositar(valor);

        }

        @Override
        public void limiteCredito(double valor){

        }

        public int getAgencia() {
                return agencia;
        }

        public int getNumero() {
                return numero;
        }

        public double getSaldo() {
                return saldo;
        }

        public String getCpf() {
                return cpf;
        }

                public double getLimiteCredito() {
                return limiteCredito;
        }

        protected void imprimirInfoComuns() {
                System.out.println(String.format("Cpf: %s" , this.cpf));
                System.out.println(String.format("Titular: %s" , this.cliente.getNome()));
                System.out.println(String.format("Agencia: %d" , this.agencia));
                System.out.println(String.format("Numero: %d" , this.numero));
                System.out.println(String.format("Saldo: %.2f" , this.saldo));
                System.out.println(String.format("LimiteCredito: %.2f" , this.limiteCredito()));
        }
}
