import javax.persistence.*;

@Entity
@Table
public class Equipo {

    @Id
    @GeneratedValue
    private int equipo_codigo;
    @Column
    private String nombre;
}
