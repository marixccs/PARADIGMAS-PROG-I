package ex6_edificio;

public class TestaEdificio {
    public static void main(String[] args) {

        // criando edifício
        Edificio ed1 = new Edificio("Residencial Sol", "Rua A, 123");

        // construindo apartamentos (composição)
        ed1.construirApartamento(101, 1);
        ed1.construirApartamento(102, 1);
        ed1.construirApartamento(201, 2);
        ed1.construirApartamento(202, 2);

        // exibindo
        System.out.println(ed1);

        // removendo edifício
        ed1 = null;

        System.out.println("Edifício removido (apartamentos deixam de existir).");
    }
}