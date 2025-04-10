package mg.tana.inomawa.entity.user;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import mg.tana.inomawa.utils.POV;

@Entity
@Getter
@Setter
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(POV.Public.class)
    private Long idWorker;

    @JsonView(POV.Public.class)
    private String description;

    @JsonView(POV.Public.class)
    private double salaire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonView(POV.Public.class)
    @JoinColumn(name = "id_user")
    private User user;
}
