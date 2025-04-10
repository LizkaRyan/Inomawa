package mg.tana.inomawa.exception.user;

public class EmailNotFoundException extends RuntimeException{

    public EmailNotFoundException(String email){
        super("l'email: "+email+" n'est pas reconnue");
    }
}
