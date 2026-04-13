public class SistemaSmartHome {
    public static void main(String[] args) {
        // Testando a Fechadura Eletrônica
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");
        fechadura.validarAcesso("1234"); // Senha correta
        fechadura.validarAcesso("4321"); // Senha incorreta

        // Testando o Termostato Smart
        TermostatoSmart termostato = new TermostatoSmart();
        termostato.ligar();
        termostato.lerTemperatura();
        termostato.desligar();
    }
}
