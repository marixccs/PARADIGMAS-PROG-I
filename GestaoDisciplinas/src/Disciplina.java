import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;


    public Disciplina() {
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }
    // Agregação
    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
        System.out.println("Aluno matriculado com sucesso");
    }
    // Composição
    public void criarAvaliacao(int id, String nome) {
        Avaliacao aux = new Avaliacao(id, nome);
        this.avaliacoes.add(aux);
        System.out.println("Avaliação criada com sucesso");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    @Override
    public String toString() {
        return "Disciplina\n" +
                "id=" + id +
                "\nnome=" + nome +
                "\nprofessor=" + professor +
                "\n\nAlunos:\n" + alunos +
                "\n\nAvaliações:\n" + avaliacoes;
    }
}
