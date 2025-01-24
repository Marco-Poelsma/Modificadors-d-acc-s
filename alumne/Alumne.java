package alumne;

public class Alumne { //El public fa que sigui visible des de qualsevol altra classe, independentment del paquet on es trobi
    String name; //Si no té modificador, només s'hi pot acedir des del paquet on es troba
    protected String username; //Només s'hi pot accedir des del paquet on es troba i des de les seves subclasses
    private String password; //Només s'hi pot accedir des de la mateixa classe

    String generateUsername (String name) {
        return name.strip().toLowerCase().replace(" ", "");
    }
}
