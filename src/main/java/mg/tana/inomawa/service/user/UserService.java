package mg.tana.inomawa.service.user;

import lombok.RequiredArgsConstructor;
import mg.tana.inomawa.dto.LoginDTO;
import mg.tana.inomawa.repository.user.UserRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

}
