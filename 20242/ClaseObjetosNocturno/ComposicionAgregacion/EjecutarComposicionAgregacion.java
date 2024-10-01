import java.time.LocalDateTime;

public class EjecutarComposicionAgregacion {
    
    public static void main(String[] args) {
        
        LocalDateTime fechaHoraEspecifica = LocalDateTime.of(2024, 10, 15, 10, 30);
        System.out.println("Fecha y hora específica: " + fechaHoraEspecifica);
        Cita objCita1 = new Cita(fechaHoraEspecifica, "Oftalmólogo");

        HistoriaClinica objHistoriaClinica;
        objHistoriaClinica = new HistoriaClinica("Me duele el ojo", "+0.50", "hialuronato");

        Paciente paciente1 = new Paciente(1006, "Alexandra Merchan", 17, "SURA", 'F', objCita1);

        System.out.println(paciente1);
    }
}
