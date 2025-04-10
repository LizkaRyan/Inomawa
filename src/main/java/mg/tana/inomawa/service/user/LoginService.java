package mg.tana.inomawa.service.user;

import lombok.RequiredArgsConstructor;
import mg.tana.inomawa.dto.LoginDTO;
import mg.tana.inomawa.entity.user.User;
import mg.tana.inomawa.entity.user.Worker;
import mg.tana.inomawa.exception.user.EmailNotFoundException;
import mg.tana.inomawa.exception.user.PasswordIncorrectException;
import mg.tana.inomawa.repository.user.UserRepo;
import mg.tana.inomawa.repository.user.WorkerRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepo userRepo;

    private final WorkerRepo workerRepo;

    public User loginUser(LoginDTO loginDTO){
        User user = userRepo.findUserByEmail(loginDTO.getEmail()).orElseThrow(()->new EmailNotFoundException(loginDTO.getEmail()));
        if(!user.getPassword().equals(loginDTO.getPassword())){
            throw new PasswordIncorrectException();
        }
        return user;
    }

    public Worker loginWorker(LoginDTO loginDTO){
        Worker worker = workerRepo.findWorkerByEmail(loginDTO.getEmail()).orElseThrow(()->new EmailNotFoundException(loginDTO.getEmail()));
        if(!worker.getUser().getPassword().equals(loginDTO.getPassword())){
            throw new PasswordIncorrectException();
        }
        return worker;
    }
}
