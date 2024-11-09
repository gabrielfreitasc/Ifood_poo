
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppDelivery {

    public static void main(String[] args) {
        String caminhoBancoDeDados = "itens_restaurante.ser";
        
        try {
            Categoria categoria1 = new Categoria("Hambúrguer");

            Restaurante restaurante = new Restaurante("Restaurante Central", "Rua das Flores, 123", categoria1);
    
            // Criando itens no banco de dados
            System.out.println("\n====================== Criação de produtos no banco de dados do " + restaurante.getNome() + " =====================");
            restaurante.adicionarItem(new Item("X-Tudo", 35.00, categoria1));
            restaurante.adicionarItem(new Item("X-Salada", 27.00, categoria1));
            restaurante.adicionarItem(new Item("X-Bacon", 30.00, categoria1));
        
            restaurante.salvarItens(caminhoBancoDeDados);
            
            restaurante.carregarItens(caminhoBancoDeDados);
            System.out.println("======================================================================================================================\n");
    
            Cliente cliente = new Cliente(1, "João Silva", "Rua das Palmeiras, 456", "joao@email.com", 12345678);
            
            List<Item> itensPedido = new ArrayList<>();

            // Linha para testar produto inexistente no banco de dados
            // String[] itensDesejados = {"Pizza"}; 
            String[] itensDesejados = {"X-Salada", "X-Tudo"}; 
            for (String nomeItemPedido : itensDesejados) {
                if (restaurante.verificarDisponibilidadeItem(nomeItemPedido)) {
                    double precoItem = restaurante.obterPrecoItem(nomeItemPedido);
                    itensPedido.add(new Item(nomeItemPedido, precoItem, categoria1));
                    System.out.println("Item " + nomeItemPedido + " adicionado ao pedido. Preço: R$" + precoItem);
                } else {
                    System.out.println("O item " + nomeItemPedido + " não está disponível no estoque.");
                    return;
                }
            }
            
            Entregador entregador = new Entregador(1, "Carlos Motta", "Moto", "carros.mota@email.com", 87654321);

            Pedido pedido = new Pedido(101, cliente, restaurante, itensPedido, false, entregador);

            Entrega entrega = new Entrega(201, pedido, entregador, LocalDateTime.now().plusHours(1));
            entrega.concluirEntrega();
            System.out.println("\nStatus do pedido após a entrega: " + (pedido.getStatus() ? "Entregue" : "Pendente"));
    
            Feedback feedback = new Feedback(301, pedido, cliente, 5, "Ótimo serviço!");

            System.out.println("\nResumo do Pedido:");
            System.out.println(pedido);
            feedback.deixarFeedback();    
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
