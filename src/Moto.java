
public class Moto extends Vehiculo {
    /**
     * Atributo de la Clase Moto.
     */
    private int cc;

    /**
     * Constructor de la Clase Moto.
     * @param matricula
     * @param marca
     * @param modelo
     * @param cc
     */
    public Moto(String matricula, String marca, String modelo, int cc) {
        super(matricula, marca, modelo);
        this.cc = cc;
    }

    /**
     * Getters y Setters de la Clase Moto.
     * @return
     */
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    /**
     * toString de la Clase Moto.
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " Moto{" + "cc=" + cc + '}';
    }
}


