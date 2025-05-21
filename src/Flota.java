
import java.util.ArrayList;

public class Flota {
    /**
     * Atributos de la Clase Flota. ListaVehículos es una relación agregación de la Clase Vehículo con la Clase Flota.
     */
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    /**
     * Constructor de la Clase Flota.
     * @param nombre
     */
    public Flota(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getters y Setters de la Clase Flota.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    /**
     * Método para agregar un vehículo a la flota.
     * @param vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
        System.out.println("\n******************************");
        System.out.println("* Vehículo agregado: " + vehiculo.getMatricula() + " *");
        System.out.println("******************************");
    }

    /**
     * Método para mostrar los vehículos de la flota.
     * @param flota
     */
    public void listVehiculos(Flota flota){
        if(listaVehiculos.isEmpty()) {
            System.out.println("\n********************************");
            System.out.println("* La flota no tiene vehículos. *");
            System.out.println("********************************");
        } else {
            System.out.println(" ");
            System.out.println("//////////////////////////////////////////////");
            System.out.println("Vehículos en la flota: ");
            for(Vehiculo vehiculos : flota.listaVehiculos){
                System.out.println(" - Vehiculo: " + vehiculos.toString());
            }
            System.out.println("//////////////////////////////////////////////");
        }
    }

    /**
     * Método para eliminar un vehículo de la flota por su matrícula.
     * @param matricula
     */
    public void removeVehiculo(String matricula){
        Vehiculo vehiculoAEliminar = null;
        for(Vehiculo vehiculo : listaVehiculos){
            if(vehiculo.getMatricula().equalsIgnoreCase(matricula)){
                vehiculoAEliminar = vehiculo;
                break;
            }
        }
        if(vehiculoAEliminar != null){
            listaVehiculos.remove(vehiculoAEliminar);
            System.out.println(" ");
            System.out.println("******************************");
            System.out.println("* Vehículo elmimado: " + matricula + " *");
            System.out.println("******************************");
        } else {
            System.out.println(" ");
            System.out.println("********************************************************");
            System.out.println("* No se encontró un vehículo con la matrícula: " + matricula + " *");
            System.out.println("********************************************************");
        }
    }

    /**
     * toString de la Clase Flota.
     * @return
     */
    @Override
    public String toString() {
        return "Nombre flota = " + nombre
                + "\nVehículos = " + listaVehiculos;
    }
}
