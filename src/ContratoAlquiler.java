
import java.time.*;
import java.time.temporal.ChronoUnit;

public class ContratoAlquiler {
    /**
     * Atributos de la Clase ContratoAlquiler.
     */
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private float precioDia;
    private Vehiculo v;
    private Cliente c;

    /**
     * Constructor de la Clase ContratoAlquiler.
     * @param fechaInicio
     * @param fechaFin
     * @param precioDia
     * @param v
     * @param c
     */
    public ContratoAlquiler(LocalDate fechaInicio, LocalDate fechaFin, float precioDia, Vehiculo v, Cliente c) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.v = v;
        this.c = c;
    }

    /**
     * Getters y Setters de la Clase ContratoAlquiler.
     * @return
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    /**
     * Métodos
     * Método nDias para calcular los días que está alquilado el vehículo, aquí hago también la transformación de tipo String a LocalDateFormate.
     * @return
     */
    public int nDias() {

        /**
         * Creamos variable days-between para hacer el calculo de los días que hay entre fechaInicio y fechaFin.
         */
        long dias = ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);

        /**
         * Este método nos devuelve el resultado de la operación que hemos hecho, tipo int.
         * Convierte un valor long en int
         */
        return (int) dias;
    }

    /**
     * Método para calcular el coste total.
     * @param total
     * @return
     */
    public float costeTotal(float total) {

        total = this.nDias() * this.precioDia;
        return total;
    }

    /**
     * toString de la Clase ContratoAlquiler.
     * @return
     */
    @Override
    public String toString() {
        return "\nFecha de Inicio: " + fechaInicio
                + "\nFecha Final: " + fechaFin
                + "\nNúmero de Dias: " + this.nDias()
                + "\nPrecio de un Dia: " + precioDia + " €"
                + "\nPrecio Total: " + this.costeTotal(precioDia) + " €"
                + "\n\n---------------------------\n";
    }
}
