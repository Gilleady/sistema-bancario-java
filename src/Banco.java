import java.util.List;

/**
 * Classe que representa um banco, contendo um nome e uma lista de contas.
 */
public class Banco {

    private String nome;
    private List<Conta> contas;

    /**
     * Retorna o nome do banco.
     * 
     * @return Nome do banco.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do banco.
     * 
     * @param nome Novo nome do banco.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a lista de contas do banco.
     * 
     * @return Lista de contas.
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * Define a lista de contas do banco.
     * 
     * @param contas Nova lista de contas.
     */
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}