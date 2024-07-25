/**
 * Interface que define os métodos básicos de uma conta bancária.
 */
public interface IConta {

    /**
     * Realiza o saque de um valor da conta.
     * 
     * @param valor Valor a ser sacado.
     */
    void sacar(double valor);

    /**
     * Realiza o depósito de um valor na conta.
     * 
     * @param valor Valor a ser depositado.
     */
    void depositar(double valor);

    /**
     * Realiza a transferência de um valor para outra conta.
     * 
     * @param valor Valor a ser transferido.
     * @param contaDestino Conta de destino da transferência.
     */
    void transferir(double valor, IConta contaDestino);

    /**
     * Imprime o extrato da conta.
     */
    void imprimirExtrato();
}