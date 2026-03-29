package src.sistemaveiculo;

public class Aviao extends Veiculo {
    private float altitude;

    public Aviao() {
        super();
    }

    public Aviao(String marca, String modelo, float velocidade, float altitude) {
        super(marca, modelo, velocidade);
        this.altitude = altitude;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Aviao " +
                super.toString() +
                " altitude = " + altitude + "m}";
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + "km/h a " + this.altitude + " metros.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação...");
    }
}
