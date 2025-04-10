package mg.tana.inomawa.repository.user;

import mg.tana.inomawa.entity.user.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkerRepo extends JpaRepository<Worker,Long> {
    @Query("select w from Worker w join fetch w.user u where u.email = :email")
    Optional<Worker> findWorkerByEmail(@Param("email")String email);
}
