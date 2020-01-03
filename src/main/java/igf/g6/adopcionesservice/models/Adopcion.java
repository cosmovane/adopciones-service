package igf.g6.adopcionesservice.models;

import javax.persistence.*;

@Entity
@Table(name = "adopciones")
public class Adopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "persona_id")
    private long persona_id;
    @Column(name = "madre_id")
    private Persona madre_id;
    @Column(name = "padre_id")
    private Persona padre_id;
    @Column(name = "fecha_adopcion")
    private String fecha_adopcion;
    @Column(name = "primer_nombre")
    private String primer_nombre;
    @Column(name = "segundo_nombre")
    private String segundo_nombre;
    @Column(name = "primer_apellido")
    private String primer_apellido;
    @Column(name = "segundo_apellido")
    private String segundo_apellido;


    public Adopcion() {

    }

    public Adopcion(long persona_id, Persona madre_id, Persona padre_id,
                    String fecha_adopcion,
                    String primer_nombre, String segundo_nombre, String primer_apellido,
                    String segundo_apellido) {
        this.persona_id = persona_id;
        this.madre_id = madre_id;
        this.padre_id = padre_id;
        this.fecha_adopcion = fecha_adopcion;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
    }

    public long getId() {
        return id;
    }

    public long getPersonaId() {
        return persona_id;
    }

    public void setPersonaId(long persona_id) {
        this.persona_id = persona_id;
    }

    public Persona getMadreId() {
        return madre_id;
    }

    public void setMadreId(Persona madreId) {
        this.madre_id = madre_id;
    }

    public Persona getPadreId() {
        return padre_id;
    }

    public void setPadreId(Persona padreId) {
        this.padre_id = padre_id;
    }

    public String getFechaAdopcion() {
        return fecha_adopcion;
    }

    public void setFechaAdopcion(String fecha_adopcion) {
        this.fecha_adopcion = fecha_adopcion;
    }

    public String getNombre1() {
        return primer_nombre;
    }

    public void setNombre1(String nombre1) {
        this.primer_nombre = primer_nombre;
    }

    public String getNombre2() {
        return segundo_nombre;
    }

    public void setNombre2(String nombre2) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getApellido1() {
        return primer_apellido;
    }

    public void setApellido1(String apellido1) {
        this.primer_apellido = primer_apellido;
    }

    public String getApellido2() {
        return segundo_apellido;
    }

    public void setApellido2(String apellido2) {
        this.segundo_apellido = segundo_apellido;
    }
}
