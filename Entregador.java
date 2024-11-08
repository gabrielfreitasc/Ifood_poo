public class Entregador {
    private String nome;
    private String veiculo;

    public Entregador(String nome, String veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void realizarEntrega() {}
}
