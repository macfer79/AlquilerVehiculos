
public class Cliente {
    /**
     * Atributos de la Clase Cliente.
     */
    private String nif;
    private String nombre;

    /**
     * Constructor de la Clase Cliente.
     * @param nif
     * @param nombre
     */
    public Cliente(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    /**
     * Getters y Setters de la Clase Cliente.
     * @return
     */
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * toString de la Clase Cliente.
     * @return
     */
    @Override
    public String toString() {
        return "NIF: " + nif + " Nombre: " + nombre;
    }
}
