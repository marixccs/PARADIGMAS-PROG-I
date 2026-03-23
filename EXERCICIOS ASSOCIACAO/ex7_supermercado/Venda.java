package ex7_supermercado;

import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItemVenda(int id, int quantidade, Produto produto) {
        this.itens.add(new ItemVenda(id, quantidade, produto));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : this.itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Venda ID: ").append(id).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Itens:\n");

        for (ItemVenda item : this.itens) {
            sb.append("  ").append(item).append("\n");
        }

        sb.append("Total: ").append(calcularTotal());

        return sb.toString();
    }
}