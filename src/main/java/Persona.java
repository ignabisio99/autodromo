import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class Persona {
    @Id
    @GeneratedValue
    private int persona_codigo;
    @ManyToOne
    @JoinColumn(name = "equipo_codigo", referencedColumnName = "equipo_codigo")
    private Equipo equipo;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String nacionalidad;
    @Column
    private Date fechaNacimiento;
    @Column
    private String certificados;
    @Column
    private String rol;
    @Column
    private float peso;
    @Column
    private Boolean verificado;
}
