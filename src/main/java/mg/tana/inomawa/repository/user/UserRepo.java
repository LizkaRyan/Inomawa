package mg.tana.inomawa.repository.user;

import mg.tana.inomawa.entity.user.User;
import mg.tana.inomawa.entity.user.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {

    @Query("select u from User u where u.email = :email")
    Optional<User> findUserByEmail(@Param("email")String email);

}
