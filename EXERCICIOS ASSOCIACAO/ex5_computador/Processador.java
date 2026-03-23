package ex5_computador;

public class Processador {
    private String marca;
    private String modelo;
    private double frequencia;

    public Processador() {
    }

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frequencia=" + frequencia +
                '}';
    }
}