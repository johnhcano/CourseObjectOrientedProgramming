import java.time.LocalDateTime;

public class Cita {
    
    private LocalDateTime fecha;
    private String especialista;

    public Cita(LocalDateTime fecha, String especialista){
        this.fecha = fecha;
        this.especialista = especialista;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }
    
    public String getEspecialista(){
        return especialista;
    }

    public void setEspecialista(String especialista){
        this.especialista = especialista;
    }

    public String toString(){
        return "Cita[ Fecha: "+ fecha + " Especialista: " + especialista + " ]";
    }

    
}