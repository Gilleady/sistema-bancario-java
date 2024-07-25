/**
 * Classe abstrata que representa uma conta bancária, implementando a interface IConta.
 */
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    /**
     * Construtor da classe Conta.
     * 
     * @param cliente Cliente associado à conta.
     */
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    /**
     * Realiza o saque de um valor da conta.
     * 
     * @param valor Valor a ser sacado.
     */
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    /**
     * Realiza o depósito de um valor na conta.
     * 
     * @param valor Valor a ser depositado.
     */
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Realiza a transferência de um valor para outra conta.
     * 
     * @param valor Valor a ser transferido.
     * @param contaDestino Conta de destino da transferência.
     */
    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    /**
     * Retorna a agência da conta.
     * 
     * @return Agência da conta.
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * Retorna o número da conta.
     * 
     * @return Número da conta.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Retorna o saldo da conta.
     * 
     * @return Saldo da conta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime informações comuns a todas as contas.
     */
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}