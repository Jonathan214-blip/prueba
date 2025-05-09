package catolica.edu.sv.pokedex.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pokemon")
public class entitiespokemon {
    @Id
    @Column(columnDefinition = "INT", name = "id_pokemon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "tipo_1", nullable = false, length = 30)
    private String tipo1;

    @Column(name = "tipo_2", length = 30)
    private String tipo2;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "altura", precision = 4, scale = 2)
    private BigDecimal altura;

    @Column(name = "peso", precision = 5, scale = 2)
    private BigDecimal peso;

    @Column(name = "evolucion_de", length = 50)
    private String evolucionDe;

    @Column(name = "activo", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private boolean activo;
}