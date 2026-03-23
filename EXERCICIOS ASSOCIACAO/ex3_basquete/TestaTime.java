package ex3_basquete;

public class TestaTime {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(1, "Lucas Dias", "ala-pivô");

        Time t1 = new Time(1, "Franca Basquete", "Helinho");
        t1.contratarAtleta(a1);

        System.out.println(t1);

        t1 = null;

        System.out.println("O time foi anulado.");
        System.out.println("Atleta continua existindo: " + a1);
    }
}
