package alumne;

public class Alumne { //El public fa que sigui visible des de qualsevol altra classe, independentment del paquet on es trobi
    String name; //Si no té modificador, només s'hi pot acedir des del paquet on es troba
    protected String username; //Només s'hi pot accedir des del paquet on es troba i des de les seves subclasses
    private String password; //Només s'hi pot accedir des de la mateixa classe

    private String generateUsername (String name) { //Els modificadors es poden aplicar a classes, mètodes i atributs.
        return name.strip().toLowerCase().replace(" ", "");
    }

    /*
     * Podem montar getters i setters públics per a poder accedir o modificar atributs privats:
     */
    public String getPassword() { //Un getter ens permet accedir a un atribut privat
        return password;
    }

    public void setPassword(String password) { //Un setter ens permet modificar un atribut privat
        this.password = password;
    }
    
}
