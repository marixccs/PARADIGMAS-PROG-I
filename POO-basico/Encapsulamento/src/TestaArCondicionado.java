public class TestaArCondicionado {
    public static void main(String[] args){
        ArCondicionado obj1 = new ArCondicionado();
        obj1.setMarca("Midea");
        obj1.setModelo("Dual Inverter");
        obj1.setTemperatura(20);
        obj1.setLigado(true);

        System.out.println("Dados do ar 1:");
        System.out.println(obj1);

        obj1.setTemperatura(10); // inválido
        obj1.ativarModoTurbo();

        System.out.println("\nDados atualizados do ar 1:");
        System.out.println(obj1);

        ArCondicionado obj2 = new ArCondicionado("Sa", "Split 9000", 25, false);

        System.out.println("\nDados do ar 2:");
        System.out.println(obj2);
    }
}