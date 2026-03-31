package src.sistemaveiculo;

public class testaVeiculo {
    public static void exibir(Veiculo referencia){
        // Veiculo referencia = ve1
        // Veiculo referencia = ce1
        System.out.println(referencia.toString());
        referencia.abastecer();
        referencia.mover(); // uma classe filha não possui esse método, o programa procura o do pai e executa

    }
    public static void main(String[] args){
        Veiculo ve1 = new Veiculo();

        Aviao av1 =
                new Aviao("Embraer", "A-29 Super Tucano", 590f, 12000);
        exibir(av1);

        CarroEletrico ce1 =
                new CarroEletrico("BYD", "Dolphin Mini", 130f, 280);
        exibir(ce1);
    }
}
