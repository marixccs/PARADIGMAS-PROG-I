public class TestaAcademico{
    public static void main(String[] args) {

        // objetos independentes
        Aluno a1 = new Aluno(1, "Mariana", "26185", "Engenharia de Software");
        Aluno a2 = new Aluno(2, "Matheus", "26186", "Sistemas de Informação");

        // disciplina
        Disciplina d1 = new Disciplina(10, "Programação Orientada a Objetos", "Prof. Daniel");

        // agregação
        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        // composição - criando avaliação
        Avaliacao av1 = new Avaliacao(1, "Prova Semestral");

        // adicionando questões
        av1.adicionarQuestao(1, "Explique o que é encapsulamento.", 3.0f);
        av1.adicionarQuestao(2, "Explique o conceito de herança.", 3.0f);
        av1.adicionarQuestao(3, "Qual a diferença entre agregação e composição?", 4.0f);

        // adicionando avaliação na disciplina
        d1.getAvaliacoes().add(av1);

        // imprimir árvore completa
        System.out.println(d1.toString());
    }
}