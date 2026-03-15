public class Drone {
    private String codigo = "Não definido";
    private float altura = -1;
    private int bateria;
    private boolean emVoo;

    public Drone(){ // Drone obj1 = new Drone()

    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo){
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.setEmVoo(emVoo);
    }

    // setters e getters
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setAltura(float altura){
        if (altura >= 0 && altura <= 120){
            this.altura = altura;
        }
        else{
            this.altura = -1;
        }
    }

    public float getAltura(){
        return this.altura;
    }

    public void setBateria(int bateria){
        if (bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        }
        else System.out.println("Bateria inválida");
    }

    public int getBateria(){
        return this.bateria;
    }

    public void setEmVoo(boolean emVoo){
        this.emVoo = emVoo;
    }

    public boolean getEmVoo(){
        return this.emVoo;
    }

    public void decolar(){
        if (this.bateria > 20){
            if (testarMotores()){
                this.emVoo = true;
                this.setAltura(2);
                System.out.println("Drone decolou com sucesso");
            }
            else System.out.println("Motores não estão prontos");
        }
        else System.out.println("Bateria insuficiente para decolar");
    }

    private boolean testarMotores(){
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        int n = (int)(Math.random() * 10);

        if (n < 8){
            return true;
        }
        else return false;
    }

    public void subir(float x){
        this.setAltura(this.altura + x);
    }

    public void descer(float x){
        this.setAltura(this.altura - x);
    }

    public String toString(){
        String alt;

        if (this.altura == -1){
            alt = "Altura inválida";
        }
        else{
            alt = String.valueOf(this.altura);
        }

        return "Código: " + this.codigo +
                "\nAltura: " + alt +
                "\nBateria: " + this.bateria +
                "\nEm voo: " + this.emVoo;
    }
}