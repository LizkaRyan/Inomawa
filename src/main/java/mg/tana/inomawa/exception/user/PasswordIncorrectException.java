package mg.tana.inomawa.exception.user;

public class PasswordIncorrectException extends RuntimeException{
    public PasswordIncorrectException(){
        super("Mot de passe incorrecte");
    }
}
