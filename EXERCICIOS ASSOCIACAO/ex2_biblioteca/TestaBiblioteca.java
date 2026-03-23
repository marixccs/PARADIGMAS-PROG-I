package ex2_biblioteca;

import java.time.LocalDateTime;

public class TestaBiblioteca {
    public static void main(String[] args) {

        // criando leitor
        Leitor l1 = new Leitor(1, "Mariana");

        // criando livro
        Livro liv1 = new Livro(1, "O Código Da Vinci", "Dan Brown");

        // datas
        LocalDateTime dataEmp = LocalDateTime.now();
        LocalDateTime dataDev = dataEmp.plusDays(7); // devolução em 7 dias

        // criando empréstimo (classe de associação)
        Emprestimo emp1 = new Emprestimo(dataEmp, dataDev, l1, liv1);

        // exibindo
        System.out.println(emp1);
    }
}