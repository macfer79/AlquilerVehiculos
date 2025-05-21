
public class Camion extends Vehiculo {
    /**
     * Atributos de la Clase Camión.
     */
    private int kg;

    /**
     * Constructor de la Clase Camión.
     * @param matricula
     * @param marca
     * @param modelo
     * @param kg
     */
    public Camion(String matricula, String marca, String modelo, int kg) {
        super(matricula, marca, modelo);
        this.kg = kg;
    }

    /**
     * Getters y Setters de la Clase Camión.
     * @return
     */
    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    /**
     * toString de la Clase Camión.
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " Camion{" + "kg=" + kg + '}';
    }
}
