import java.util.Date;

public class Entrega {
    private int idEntrega;
    private Pedido pedido;
    private Entregador entregador;
    private Date dataEntrega;

    public Entrega(int idEntrega, Pedido pedido, Entregador entregador, Date dataEntrega) {
        this.idEntrega = idEntrega;
        this.pedido = pedido;
        this.entregador = entregador;
        this.dataEntrega = dataEntrega;
    }

    public int geIdEntrega() {
        return this.idEntrega;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Entregador getEntregador() {
        return this.entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public Date getDataEntrega() {
        return this.dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void concluirEntrega() {}
}
