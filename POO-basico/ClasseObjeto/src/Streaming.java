public class Streaming {
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    // Metodo construtor

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        if (plano.equals("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equals("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equals("Família")) {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0.0f;
            System.out.println("Plano inválido.");
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa. É necessário pagar a fatura.");
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    public String toString() {
        return "--- Dados da Assinatura ---\n" +
                "Usuário: " + this.usuario + "\n" +
                "Plano: " + this.plano + "\n" +
                "Mensalidade: R$" + this.mensalidade + "\n" +
                "Status: " + (this.ativo ? "Ativo" : "Suspenso") + "\n" +
                "Último filme assistido: " + this.ultimoFilmeAssistido + "\n";
    }
}