public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean statusTermostato = false; // Inicialmente desligado

    @Override
    public void ligar() {
        statusTermostato = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        statusTermostato = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        // Simulação de temperatura
        double temperaturaAtual = 22.5; // Pode ser variável
        System.out.println("Temperatura atual: " + temperaturaAtual + "°C");
        return temperaturaAtual;
    }
}
