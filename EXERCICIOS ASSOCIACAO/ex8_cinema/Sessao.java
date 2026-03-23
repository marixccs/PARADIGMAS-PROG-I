package ex8_cinema;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        this.ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");

        sb.append("Sessao ID: ").append(id).append("\n");
        sb.append("Filme: ").append(filme).append("\n");
        sb.append("Sala: ").append(sala).append("\n");
        sb.append("Horario: ").append(horario.format(formatoBR)).append("\n");

        sb.append("Ingressos:\n");
        for (Ingresso i : ingressos) {
            sb.append("  ").append(i).append("\n");
        }

        return sb.toString();
    }
}