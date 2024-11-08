import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private Restaurante restaurante;
    private List<Item> itens;
    private boolean status;

    public Pedido(int idPedido, Cliente cliente, List<Item> itens, boolean status) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.itens = itens;
        this.restaurante = restaurante;
        this.status = status;
    }

    public int getIdPedido() {
        return this.idPedido;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Restaurante getRestaurante() {
        return this.restaurante;
    }
    
    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
