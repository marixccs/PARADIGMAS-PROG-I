package ex7_supermercado;

public class ItemVenda {
    private int id;
    private int quantidade;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double calcularSubtotal() {
        return this.quantidade * this.produto.getPreco();
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}