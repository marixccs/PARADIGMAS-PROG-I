public class TestaDev {

    public static void exibir(Desenvolvedor camaleao){
        // polimorfismo
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }
    public static void main(String[] args) {
        // criar um objeto Desenvolvedor
        Desenvolvedor dev1 = new Desenvolvedor();

        // criar um júnior
        Junior jr1 =
        new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);

        // criar um pleno
        Pleno pl1 =
        new Pleno("Beltrano", "Java", 5000, 5);
        exibir(pl1);

        // criar um sênior
        Senior se1 = new Senior("Ciclano", "Java", 6000, 3000);
        exibir(se1);
    }
}
