import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; //associação todo-parte
    private ArrayList<ItemPedido> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList<>(); //aloca espaço na memória para vetor
    }

    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente; // agregação pois o cliente vem pronto, eu atribuo ele ao pedido
        this.itensPedido = new ArrayList<>(); //aloca espaço na memória para vetor
    }

    public void adicionaItemPedido(int id, int qtde, Produto produto){
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        this.itensPedido.add(aux);
        System.out.println("Item adicionado com sucesso");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente + // ele vai puxar a classe cliente (com id, nome e td mais) mas vai chamar o toString do cliente
                "Itens do pedido:\n" + itensPedido +
                '}';
    }
}
