public class TestaStreaming{
    public static void main(String[] args) {
        Streaming s1 = new Streaming("Mariana", "Premium");
        System.out.println(s1.toString());

        s1.assistirFilme("Interestelar");
        System.out.println(s1.toString());

        s1.cancelarAssinatura();
        s1.assistirFilme("Avatar");
        System.out.println(s1.toString());

        Streaming s2 = new Streaming("João", "Básico");
        s2.assistirFilme("Toy Story");
        System.out.println(s2.toString());
    }
}