package alumne;

public class Alumne {
    String name; //Si no té modificador, només s'hi pot acedir des del paquet on es troba
    String username;
    String password;

    String generateUsername (String name) {
        return name.strip().toLowerCase().replace(" ", "");
    }
}
