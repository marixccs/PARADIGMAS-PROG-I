package ex4_projeto;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto() {
        this.programadores = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public void adicionarProgramador(Programador p) {
        this.programadores.add(p);
    }

    public void listarProgramadores() {
        System.out.println("Programadores do projeto " + this.nomeProjeto + ":");
        for (Programador p : this.programadores) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", programadores=" + programadores +
                '}';
    }
}