
public class TestaVetorPolimorfico {

    public static void main(String[] args) {

        Desenvolvedor[] folha = new Desenvolvedor[4];

        folha[0] = new Junior("Ana", "Java", 4000, "Carlos");
        folha[1] = new Pleno("Bruno", "Python", 6000, 8);
        folha[2] = new Senior("Clara", "C#", 9000, 3000);
        folha[3] = new Desenvolvedor("Diego", "JavaScript", 5000);

        for (Desenvolvedor dev : folha) {
            dev.codar();
            System.out.println("Bônus: " + dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println("-------------------------");
        }
    }
}
