public class Restaurante {
    private String nome;
    private String endereco;
    private Categoria categoria;

    public Restaurante(String nome, String endereco, Categoria categoria) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void listarItens() {}
}
