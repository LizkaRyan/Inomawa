package mg.tana.inomawa.entity.work;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWork;

    private String description;

    private LocalDate date;

    private LocalTime time;

    private String addresse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_service")
    private ServiceCategory service;
}
