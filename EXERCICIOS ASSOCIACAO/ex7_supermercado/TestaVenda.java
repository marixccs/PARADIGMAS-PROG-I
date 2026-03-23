package ex7_supermercado;


public class TestaVenda {
    public static void main(String[] args) {

        Produto prod1 = new Produto(1, "Arroz", 25.90);
        Produto prod2 = new Produto(2, "Feijao", 8.50);
        Produto prod3 = new Produto(3, "Leite", 5.75);

        Cliente cli1 = new Cliente(1, "Mariana");

        Venda venda1 = new Venda(100, cli1);

        venda1.adicionarItemVenda(1, 2, prod1);
        venda1.adicionarItemVenda(2, 3, prod2);
        venda1.adicionarItemVenda(3, 4, prod3);

        System.out.println(venda1);
    }
}