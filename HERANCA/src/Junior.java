public class Junior extends Desenvolvedor { //extends é utilizada para dizer que é herança
         private String mentor;


         public Junior(){
             super(); //chama construtor da superclasse  - sempre que tem um construtor do filho, sempre deve chamar o do pai
         }

    public Junior(String mentor) {
        this.mentor = mentor;
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }


}
