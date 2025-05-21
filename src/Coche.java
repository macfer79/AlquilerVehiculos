
public class Coche extends Vehiculo {
    /**
     * Atributos de la Clase Coche.
     */
    private int puertas;
    private int plazas;

    /**
     * Constructor de la Clase Coche.
     * @param matricula
     * @param marca
     * @param modelo
     * @param puertas
     * @param plazas
     */
    public Coche( String matricula, String marca, String modelo, int puertas, int plazas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
        this.plazas = plazas;
    }

    /**
     * Getters y Setters de la Clase Coche.
     * @return
     */

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    /**
     * toString de la Clase Coche.
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " Coche{" + "puertas=" + puertas + ", plazas=" + plazas + '}';
    }
}
