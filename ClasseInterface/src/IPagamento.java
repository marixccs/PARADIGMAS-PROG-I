public interface IPagamento {
    // contrato: quem implementar essa interface, deve implementar esses métodos

    void autorizar(float valor); //não precisa colocar public, pois quando deixamos somente void, já é public por definição
    //adicionou o float valor para que dê certo de utilizar na classe CartaoCredito

    public void exibirComprovante();
}