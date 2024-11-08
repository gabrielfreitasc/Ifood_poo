public class Feedback {
    private int idFeedback;
    private Pedido pedido;
    private Cliente cliente;
    private int avaliacao;
    private String comentario;

    public Feedback(int idFeedback, Pedido pedido, Cliente cliente, int avaliacao, String comentario) {
        this.idFeedback = idFeedback;
        this.pedido = pedido;
        this.cliente = cliente;
        this.avaliacao = avaliacao;
        this.comentario = comentario;
    }

    public int getIdFeedback() {
        return this.idFeedback;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void deixarFeedback() {}
}
