import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int equipo_codigo;
    @Column
    private String nombre;

    @OneToMany
    @JoinColumn(name = "equipo_codigo", referencedColumnName = "equipo_codigo")
    private List<Persona> personas;
}
