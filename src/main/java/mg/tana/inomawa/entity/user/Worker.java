package mg.tana.inomawa.entity.user;

import jakarta.persistence.*;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWorker;

    private String description;

    private double salaire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;
}
