package ex4_projeto;

public class TestaProjeto {
    public static void main(String[] args) {

        // criando programadores
        Programador p1 = new Programador(1, "Mariana", "Java");
        Programador p2 = new Programador(2, "Maria Gabriela", "Python");
        Programador p3 = new Programador(3, "Matheus", "C#");

        // criando projeto
        Projeto projeto = new Projeto(100, "Sistema de Vendas");

        // agregando programadores ao projeto
        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);
        projeto.adicionarProgramador(p3);

        // listando programadores
        projeto.listarProgramadores();
    }
}