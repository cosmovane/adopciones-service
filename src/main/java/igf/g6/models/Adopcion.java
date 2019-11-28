package igf.g6.models;

import java.util.Date;

public class Adopcion {
    private int id;
    private int personaId; //cambiar de int a persona class
    private Date fecha;
    private String nombre;

    public Adopcion(int id, int personaId, Date fecha, String nombre) {
        this.id = id;
        this.personaId = personaId;
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
