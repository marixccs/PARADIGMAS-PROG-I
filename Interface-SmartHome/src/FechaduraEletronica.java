public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private boolean statusFechadura = false; // Fechadura fechada inicialmente
    private String senhaCorreta;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(this.senhaCorreta)) {
            System.out.println("Acesso validado! Fechadura destrancada.");
            this.ligar(); // Destranca ao validar a senha
        } else {
            System.out.println("Senha incorreta! Tente novamente.");
        }
    }

    @Override
    public void ligar() {
        this.statusFechadura = true;
        System.out.println("Fechadura destrancada!");
    }

    @Override
    public void desligar() {
        this.statusFechadura = false;
        System.out.println("Fechadura travada!");
    }
}