package src.sistemaveiculo;

public class testaVeiculo {
    public static void exibir(Veiculo camaleao){

        System.out.println(camaleao.toString());
        camaleao.abastecer();
        camaleao.mover();

    }
    public static void main(String[] args){
        Veiculo ve1 = new Veiculo();

        Aviao av1 =
                new Aviao("Embraer", "A-29 Super Tucano", 590, 12000);
        exibir(av1);

        CarroEletrico ce1 =
                new CarroEletrico("BYD", "Dolphin Mini", 130, 280);
        exibir(ce1);
    }
}
