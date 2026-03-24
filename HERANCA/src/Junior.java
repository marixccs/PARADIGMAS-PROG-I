public class Junior extends Desenvolvedor { //extends é utilizada para dizer que é herança
    private String mentor;

    public Junior() {
        super(); //chama construtor da superclasse  - sempre que tem um construtor do filho, sempre deve chamar o do pai
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override // anulação de método herdeiro
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor: " + this.mentor;

        // sempre que chamar o toString do filho deve chamar o toString do pai.
    }

    @Override
    public void codar() {
        System.out.println("Junior desenvolvendo código sob a mentoria de " + this.mentor);
    }
}
