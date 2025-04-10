package mg.tana.inomawa.entity.user;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import mg.tana.inomawa.utils.POV;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(POV.Public.class)
    private Long idUser;

    @JsonView(POV.Public.class)
    private String email;

    private String password;

    @JsonView(POV.Public.class)
    private String name;

    @JsonView(POV.Public.class)
    private String lastName;
}
