public class TestaSmartTv {

    public static void main(String[] args){
        SmartTv obj1 = new SmartTv();

        obj1.setVolume(120); // não vai dar certo
        obj1.setVolume(30);  // vai dar certo
        obj1.setMarca("LG");
        obj1.setModelo("OLED 50");

        System.out.println("Dados da TV 1:");
        System.out.println("Marca: " + obj1.getMarca());
        System.out.println("Modelo: " + obj1.getModelo());
        System.out.println("Volume: " + obj1.getVolume());

        SmartTv obj2 = new SmartTv("Samsung", "QLed 32", -30);

        System.out.println("\nDados da TV 2:");
        System.out.println("Marca: " + obj2.getMarca());
        System.out.println("Modelo: " + obj2.getModelo());
        System.out.println("Volume: " + obj2.getVolume());

        obj2.setModelo("Modelo muito grande para testar se passa do limite de trinta caracteres");
        obj2.setVolume(80);

        System.out.println("\nDados atualizados da TV 2:");
        System.out.println("Marca: " + obj2.getMarca());
        System.out.println("Modelo: " + obj2.getModelo());
        System.out.println("Volume: " + obj2.getVolume());
    }
}