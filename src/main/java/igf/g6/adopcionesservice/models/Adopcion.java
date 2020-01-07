package igf.g6.adopcionesservice.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "adopciones")
public class Adopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "persona_id")
    private long persona_id;
    @Column(name = "madre_id")
    private long madre_id;
    @Column(name = "padre_id")
    private long padre_id;
    @Column(name = "fecha_adopcion")
    private Date fecha_adopcion;
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

    public Adopcion(long persona_id, long madre_id, long padre_id,
                    Date fecha_adopcion,
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

    public void setId(long id) {
        this.id = id;
    }

    public long getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(long persona_id) {
        this.persona_id = persona_id;
    }

    public long getMadre_id() {
        return madre_id;
    }

    public void setMadre_id(long madre_id) {
        this.madre_id = madre_id;
    }

    public long getPadre_id() {
        return padre_id;
    }

    public void setPadre_id(long padre_id) {
        this.padre_id = padre_id;
    }

    public Date getFecha_adopcion() {
        return fecha_adopcion;
    }

    public void setFecha_adopcion(Date fecha_adopcion) {
        this.fecha_adopcion = fecha_adopcion;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }
}
