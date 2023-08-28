import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table
@Getter @Setter
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int persona_codigo;

    private String nombre;

    private String apellido;

    private String nacionalidad;

    private Date fechaNacimiento;

    private Boolean verificado;

}
