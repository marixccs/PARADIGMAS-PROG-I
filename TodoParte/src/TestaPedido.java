import java.util.Date;

public class TestaPedido{
    public static void main(String[] args){
        //Cliente é independente do Pedido
        Cliente cl1 = new Cliente (100, "Mariana", "467", "Rua Cuba");

        Pedido ped1 = new Pedido(1, new Date(), cl1);

        System.out.println(ped1.toString());

        Produto prod1 = new Produto(1, "RTX 5090", "PLACA DE VIDEO MSI 5090", 20000.f);
        Produto prod2 = new Produto(2, "RTX 5080", "PLACA DE VIDEO MSI 5080", 10000.f);

        ped1.adicionaItemPedido(1, 1, prod1);
        ped1.adicionaItemPedido(2, 2, prod2);

        System.out.println(ped1.toString());

    }
}