/**
 * Classe que representa uma conta poupança, herdando da classe Conta.
 */
public class ContaPoupanca extends Conta {

    /**
     * Construtor da classe ContaPoupança.
     * 
     * @param cliente Cliente associado à conta.
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    /**
     * Imprime o extrato da conta poupança.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}