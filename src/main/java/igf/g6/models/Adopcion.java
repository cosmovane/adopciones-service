package igf.g6.models;

import java.util.Date;

public class Adopcion {
    private int id;
    private int personaId; //cambiar de int a persona class
    private String fecha;
    private String nombre;

    public Adopcion(int id, int personaId, String fecha, String nombre) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
