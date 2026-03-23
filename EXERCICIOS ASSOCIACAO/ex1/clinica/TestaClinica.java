package ex1.clinica;

import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        Medico med1 = new Medico(1, "Dra. Mariana", "Cardiologia");
        Paciente pac1 = new Paciente(1, "Bruno", "123.456.789-00");

        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 30);

        Consulta con1 = new Consulta(dataConsulta, 350.0, med1, pac1);

        System.out.println(con1);
    }
}