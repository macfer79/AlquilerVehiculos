
public class Agencia {
    /**
     * Atributos de la Clase Agencia.
     */
    private String nombre;
    private Flota flota;

    /**
     * Constructor de la Clase Agencia.
     * @param nombre
     * @param flota
     */
    public Agencia(String nombre, Flota flota) {
        this.nombre = nombre;
        this.flota = flota;
    }

    /**
     * Getters y Setters de la Clase Agencia.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    /**
     * toString de la Clase Agencia.
     * @return
     */
    @Override
    public String toString() {
        return "Agencia{" +
                "nombre='" + nombre + '\'' +
                ", flota=" + flota +
                '}';
    }
    
}
