public class Placar {
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    // Método construtor
    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {
        if (tipo != 1 && tipo != 2 && tipo != 3) {
            System.out.println("Tipo de ponto inválido.");
            return;
        }

        if (time.equals("casa")) {
            this.pontosCasa += tipo;
            System.out.println("Pontos para o time da casa: +" + tipo);
        } else if (time.equals("visitante")) {
            this.pontosVisitante += tipo;
            System.out.println("Pontos para o time visitante: +" + tipo);
        } else {
            System.out.println("Time inválido. Use 'casa' ou 'visitante'.");
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto < 4) {
            this.periodoQuarto++;
            System.out.println("Iniciando o " + this.periodoQuarto + "º quarto.");
        } else {
            System.out.println("O jogo terminou.");
        }
    }

    public String toString() {
        return this.nomeTimeCasa + " [" + this.pontosCasa + "] x [" + this.pontosVisitante + "] "
                + this.nomeTimeVisitante + " - Período: " + this.periodoQuarto;
    }
}