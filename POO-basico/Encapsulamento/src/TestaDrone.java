public class TestaDrone {

    public static void main(String[] args){
        Drone obj1 = new Drone();

        obj1.setCodigo("DR001");
        obj1.setBateria(50);
        obj1.setAltura(10);
        obj1.setEmVoo(false);

        System.out.println("Dados do drone 1:");
        System.out.println(obj1);

        obj1.decolar();
        obj1.subir(20);
        obj1.descer(5);

        System.out.println("\nDados atualizados do drone 1:");
        System.out.println(obj1);

        Drone obj2 = new Drone("DR002", 130, 10, false);

        System.out.println("\nDados do drone 2:");
        System.out.println(obj2);

        obj2.decolar();
    }
}