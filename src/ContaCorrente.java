/**
 * Classe que representa uma conta corrente, herdando da classe Conta.
 */
public class ContaCorrente extends Conta {

    /**
     * Construtor da classe ContaCorrente.
     * 
     * @param cliente Cliente associado à conta.
     */
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    /**
     * Imprime o extrato da conta corrente.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}