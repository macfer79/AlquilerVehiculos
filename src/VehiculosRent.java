
import java.util.ArrayList;

public class VehiculosRent {
    /**
     * Atributos de la Clase VehículosRent.
     */
    private String nif;
    private String nombre;
    /**
     * Relaciones entre la Clase VehículosRent y las listas de Clientes, Agencia y Flota.
     */
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Agencia> agencias = new ArrayList<>();
    private ArrayList<Flota> flotas = new ArrayList<>();

    /**
     * Constructor de la Clase VehículosRent.
     * @param nif
     * @param nombre
     */
    public VehiculosRent(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    /**
     * Getters y Setters de la Clase VehículosRent.
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public ArrayList<Flota> getFlotas() {
        return flotas;
    }

    public void setFlotas(ArrayList<Flota> flotas) {
        this.flotas = flotas;
    }

    /**
     * toString de la Clase VehículosRent.
     * @return
     */
    @Override
    public String toString() {
        return "VehiculosRent{" +
                "clientes=" + clientes +
                ", agencias=" + agencias +
                ", flotas=" + flotas +
                '}';
    }

    /**
     * Método para gestionar la lista Clientes.
     * @param cliente
     */
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    /**
     * Método para gestionar la lista Agencia que tiene una relación de composición con VehículosRent. Agencia no puede existir sin la Clase VehículosRent.
     * @param nombre
     * @param flota
     */
    public void agregarAgencia(String nombre, Flota flota){
        Agencia agencia = new Agencia(nombre, flota);
        agencias.add(agencia);
    }

    /**
     * Método para gestionar la lista Flota.
     * @param flota
     */
    public void agregarFlota(Flota flota){
        flotas.add(flota);
    }

}
