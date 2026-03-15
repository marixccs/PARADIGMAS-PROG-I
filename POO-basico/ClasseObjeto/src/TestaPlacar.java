public class TestaPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar("Lakers", "Bulls");

        System.out.println(p1.toString());

        p1.registrarPonto("casa", 2);
        p1.registrarPonto("visitante", 3);
        p1.registrarPonto("casa", 1);

        System.out.println(p1.toString());

        p1.proximoQuarto();
        p1.registrarPonto("visitante", 2);
        p1.registrarPonto("visitante", 3);

        System.out.println(p1.toString());

        p1.proximoQuarto();
        p1.proximoQuarto();
        p1.proximoQuarto(); // aqui deve dizer que o jogo terminou
    }
}