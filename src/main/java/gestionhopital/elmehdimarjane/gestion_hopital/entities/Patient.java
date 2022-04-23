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
    private String Nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean Malade;
    private int Score;

}
