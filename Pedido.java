import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private Restaurante restaurante;
    private Entregador entregador;
    private List<Item> itens;
    private boolean status;

    public Pedido(int idPedido, Cliente cliente, Restaurante restaurante, List<Item> itensPedido, boolean status, Entregador entregador) {
        this.idPedido = idPedido;
        setCliente(cliente);
        setRestaurante(restaurante);
        this.itens = itensPedido;
        this.status = true;
        this.entregador = entregador;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }
        this.cliente = cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        if (restaurante == null) {
            throw new IllegalArgumentException("Restaurante não pode ser nulo.");
        }
        this.restaurante = restaurante;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo.");
        }
        itens.add(item);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEnderecoCliente() {
        return cliente.getEndereco();
    }

    public String getEnderecoRestaurante() {
        return restaurante.getEndereco();
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador() {
        if (cliente == null) {
            throw new IllegalArgumentException("Entregador não pode ser nulo.");
        }
        this.entregador = entregador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPedido ID: ").append(idPedido)
          .append("\nCliente: ").append(cliente.getNome())
          .append("\nRestaurante: ").append(restaurante.getNome())
          .append("\nEntregador: ").append(entregador.getNome())
          .append("\nStatus: ").append(status ? "Ativo" : "Entregue")
          .append("\nItens:\n");
          itens.forEach(item -> sb.append("- ").append(item.getNome()).append(": R$").append(item.getPreco()).append("\n"));
        return sb.toString();
    }
}
