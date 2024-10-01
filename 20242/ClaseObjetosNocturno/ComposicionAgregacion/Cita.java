import java.sql.Date;

public class Cita {
    
    private Date fecha;
    private String especialista;

    public Cita(Date fecha, String especialista){
        this.fecha = fecha;
        this.especialista = especialista;
    }

    public Date getFecha(){
        return fecha;
    }

    public void setFecha(Date fecha){
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