package ex8_cinema;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Batman", "Ação", 176);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 155);

        Sessao s1 = new Sessao(1, LocalDateTime.of(2026, 7, 20, 20, 0), 1);

        s1.vincularFilme(f1);

        s1.venderIngresso(1, "A1", "Inteira", 40.0f);
        s1.venderIngresso(2, "A2", "Meia", 20.0f);
        s1.venderIngresso(3, "A3", "Inteira", 40.0f);

        System.out.println(s1);
    }
}