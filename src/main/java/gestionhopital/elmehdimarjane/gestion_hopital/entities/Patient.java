package gestionhopital.elmehdimarjane.gestion_hopital.entities;

import lombok.*;
import javax.persistence.*;
import java.util.*;




@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date date;
    private boolean malade;
    private int score;

}
