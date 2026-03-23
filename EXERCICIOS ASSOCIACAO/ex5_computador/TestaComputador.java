package ex5_computador;

public class TestaComputador {
    public static void main(String[] args) {

        // criando computador (processador é criado DENTRO dele)
        Computador pc1 = new Computador(1, "Dell", "Intel", "i7", 3.5);

        // exibindo
        System.out.println(pc1);

        // "apagando" o computador
        pc1 = null;

        System.out.println("Computador removido (processador também deixa de existir).");
    }
}