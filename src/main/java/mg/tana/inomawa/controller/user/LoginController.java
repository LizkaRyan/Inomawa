package mg.tana.inomawa.controller.user;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import mg.tana.inomawa.dto.LoginDTO;
import mg.tana.inomawa.dto.ResponseJson;
import mg.tana.inomawa.entity.user.User;
import mg.tana.inomawa.entity.user.Worker;
import mg.tana.inomawa.service.user.LoginService;
import mg.tana.inomawa.utils.POV;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/user")
    @JsonView(POV.Public.class)
    public ResponseJson<?> loginUser(@RequestBody LoginDTO loginDTO){
        try {
            User user = loginService.loginUser(loginDTO);
            return new ResponseJson<>(200,"Login effectué",user);
        }
        catch (RuntimeException ex){
            return new ResponseJson<>(400,ex.getMessage());
        }
    }

    @PostMapping("/worker")
    @JsonView(POV.Public.class)
    public ResponseJson<?> loginWorker(@RequestBody LoginDTO loginDTO){
        try {
            Worker worker = loginService.loginWorker(loginDTO);
            return new ResponseJson<>(200,"Login effectué",worker);
        }
        catch (RuntimeException ex){
            return new ResponseJson<>(400,ex.getMessage());
        }
    }
}
