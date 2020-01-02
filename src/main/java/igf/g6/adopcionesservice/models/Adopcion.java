package igf.g6.adopcionesservice.models;

import javax.persistence.*;

@Entity
@Table(name = "adopciones")
public class Adopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "personaId")
    private long personaId;
    @Column(name = "madreId")
    private long madreId;
    @Column(name = "padreId")
    private long padreId;
    @Column(name = "fechaAdopcion")
    private String fechaAdopcion;
    @Column(name = "nombre1")
    private String nombre1;
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "apellido1")
    private String apellido1;
    @Column(name = "apellido2")
    private String apellido2;


    public Adopcion() {

    }

    public Adopcion(long personaId, long madreId, long padreId, String fechaAdopcion, String nombre1, String nombre2, String apellido1, String apellido2) {
        this.personaId = personaId;
        this.madreId = madreId;
        this.padreId = padreId;
        this.fechaAdopcion = fechaAdopcion;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public long getId() {
        return id;
    }

    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public long getMadreId() {
        return madreId;
    }

    public void setMadreId(long madreId) {
        this.madreId = madreId;
    }

    public long getPadreId() {
        return padreId;
    }

    public void setPadreId(long padreId) {
        this.padreId = padreId;
    }

    public String getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(String fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}
