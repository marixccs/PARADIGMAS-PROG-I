package src.CanalNot;

public class Email extends CanalNotificacao {
    private String assunto;

    public Email(){
        super();                //chama o construtor sem parametro do CanalNotificacao, reutilização de código
    }
    public Email(String destinatario, String mensagem, String assunto){
        super(destinatario, mensagem);  //chama o construtor com parametro do CanalNotificacao
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar(){
        System.out.println("Enviando E-mail para " + this.destinatario + " com o assunto " +
                this.assunto  + ":" + this.mensagem);
    }

    @Override
    public String toString() {
        return "Email{" +
                "assunto='" + assunto + '\'' +
                super.toString() + " }";
    }
}
