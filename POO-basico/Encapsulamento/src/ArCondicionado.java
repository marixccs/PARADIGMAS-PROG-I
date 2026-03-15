public class ArCondicionado {
    private String marca = "Não definida";
    private String modelo = "Não definido";
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){

    }
    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }
    // setters e getters
    public void setMarca(String marca){
        if (marca.length() >= 3){
            this.marca = marca;
        }
        else System.out.println("Marca inválida");
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setTemperatura(int temperatura){
        if (temperatura >= 16 && temperatura <= 30){
            this.temperatura = temperatura;
        }
        else System.out.println("Temperatura fora da faixa");
    }
    public int getTemperatura(){
        return this.temperatura;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void ativarModoTurbo(){
        if (verificarCompressor()){
            this.setTemperatura(16);
            System.out.println("Modo turbo ativado");
        }
        else System.out.println("Falha no compressor");
    }
    private boolean verificarCompressor(){
        int n = (int)(Math.random() * 10);
        if (n > 2){
            return true;
        }
        else return false;
    }
    public String toString(){
        return "Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nTemperatura: " + this.temperatura +
                "\nLigado: " + this.ligado;
    }
}