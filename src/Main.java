/**
 * Classe principal do projeto, contendo o método main para execução do programa.
 */
public class Main {

    /**
     * Método principal do programa.
     * 
     * @param args Argumentos de linha de comando.
     */
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}