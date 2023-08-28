import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehiculo_codigo;
    private String marca;
    private String modelo;
    private int rodado;

    @Enumerated(EnumType.STRING)
    private TipoVehiculo tipoVehiculo;
}
