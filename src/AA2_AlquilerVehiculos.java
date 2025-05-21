
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AA2_AlquilerVehiculos {

    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        AA2_AlquilerVehiculos prg = new AA2_AlquilerVehiculos();
        prg.inicio();
    }

    void inicio() {
        boolean salir = false;
        char opcio;

        /**
         * Creamos la empresa de alquiler de vehículos.
         */
        VehiculosRent vehiculosRent = new VehiculosRent("45847568G", "RentaCar");

        /**
         * Creamos la flota y la agregamos a la empresa.
         */
        Flota flota1 = new Flota("Flota Comercial");
        vehiculosRent.agregarFlota(flota1);

        /**
         * Agregamos las agencias a la empresa.
         */
        vehiculosRent.agregarAgencia("Agencia Zaragoza", flota1);
        vehiculosRent.agregarAgencia("Agencia Barcelona", flota1);

        /**
         * Creamos los clientes y los asignamos a la empresa.
         */
        Cliente cliente1 = new Cliente("54569887X", "Juan Pérez");
        Cliente cliente2 = new Cliente("78954562M", "Ana López");
        vehiculosRent.agregarCliente(cliente1);
        vehiculosRent.agregarCliente(cliente2);

        /**
         * Menú principal.
         */

        do {
            System.out.println(" ");
            System.out.println("1. Añadir vehículos en una flota");
            System.out.println("2. Mostrar vehículos de una flota");
            System.out.println("3. Quitar un vehículo de una flota");
            System.out.println("4. Ejemplo solución AA1");
            System.out.println("0. Salir de la aplicación");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1':
                    addVehiculoFlota(flota1);
                    break;
                case '2':
                    mostrarVehiculosFlota(flota1);
                    break;
                case '3':
                    quitarVehiculosFlota(flota1);
                    break;
                case '4':
                    ejemploAA1();
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    /**
     * Método para pedir la opción del menú principal.
     * @return
     */
    char demanarOpcioMenu() {
        String resp;
        System.out.print("Elige una opción (1,2,3,4 o 0): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    /**
     * Método para añadir un vehículo a la flota.
     * @param flota
     */
    void addVehiculoFlota(Flota flota) {

        /**
         * Se pide al usuario una opción.
         */
        String option;
        System.out.print("\nIndica el tipo de vehículo (Coche: 1, Moto: 2, Camión: 3, Salir: 0): ");
        option = teclado.nextLine();
        if (option.isEmpty()){
            option = " ";
        }
        /**
         * Convierte un valor String en char.
         */
        char c = option.charAt(0);

        switch (c) {
            case '1':
                /**
                 * Se le pide al usuario que introduzca los datos del vehículo Clase Coche.
                 */
                System.out.println("\nIntroduzca los datos del coche ");

                System.out.print("Matrícula: ");
                String matricula1 = teclado.nextLine();
                if (matricula1.isEmpty()) {
                    matricula1 = " ";
                }

                System.out.print("Marca: ");
                String marca1 = teclado.nextLine();
                if (marca1.isEmpty()) {
                    marca1 = " ";
                }

                System.out.print("Modelo: ");
                String modelo1 = teclado.nextLine();
                if (modelo1.isEmpty()) {
                    modelo1 = " ";
                }

                System.out.print("Número de puertas: ");
                int puertas = teclado.nextInt();

                System.out.print("Número de plazas: ");
                int plazas = teclado.nextInt();

                /**
                 * Se guarda los datos en la variable y se añade en la flota.
                 */
                Vehiculo vehiculo1 = new Coche(matricula1, marca1, modelo1, puertas, plazas);
                flota.addVehiculo(vehiculo1);
                break;

            case '2':
                /**
                 * Se le pide al usuario que introduzca los datos del vehículo Clase Moto.
                 */
                System.out.println("\nIntroduzca los datos de la moto ");

                System.out.print("Matrícula: ");
                String matricula2 = teclado.nextLine();
                if (matricula2.isEmpty()) {
                    matricula2 = " ";
                }

                System.out.print("Marca: ");
                String marca2 = teclado.nextLine();
                if (marca2.isEmpty()) {
                    marca2 = " ";
                }

                System.out.print("Modelo: ");
                String modelo2 = teclado.nextLine();
                if (modelo2.isEmpty()) {
                    modelo2 = " ";
                }

                System.out.print("Centímetros cúbicos: ");
                int cc = teclado.nextInt();

                /**
                 * Se guarda los datos en la variable y se añade en la flota.
                 */
                Vehiculo vehiculo2 = new Moto(matricula2, marca2, modelo2, cc);
                flota.addVehiculo(vehiculo2);
                break;

            case '3':
                /**
                 * Se le pide al usuario que introduzca los datos del vehículo Clase Moto.
                 */
                System.out.println("\nIntroduzca los datos del camión: ");

                System.out.print("Matrícula: ");
                String matricula3 = teclado.nextLine();
                if (matricula3.isEmpty()) {
                    matricula3 = " ";
                }

                System.out.print("Marca: ");
                String marca3 = teclado.nextLine();
                if (marca3.isEmpty()) {
                    marca3 = " ";
                }

                System.out.print("Modelo: ");
                String modelo3 = teclado.nextLine();
                if (modelo3.isEmpty()) {
                    modelo3 = " ";
                }

                System.out.print("Capacidad de carga de Kilogramos: ");
                int kg = teclado.nextInt();

                /**
                 * Se guarda los datos en la variable y se añade en la flota.
                 */
                Vehiculo vehiculo3 = new Camion(matricula3, marca3, modelo3, kg);
                flota.addVehiculo(vehiculo3);
                break;

            case '0':
                break;
        }
        /**
         * Limpia el buffer.
         */
        teclado.nextLine();
    }

    /**
     * Método para mostrar por pantalla los vehículos de la flota.
     * @param flota
     */
    void mostrarVehiculosFlota(Flota flota) {
        flota.listVehiculos(flota);
    }

    /**
     * Método para eliminar un vehículo de la flota.
     * @param flota
     */
    void quitarVehiculosFlota(Flota flota) {
        if(flota.getListaVehiculos().isEmpty()){
            System.out.println("\n**********************************************");
            System.out.println("* La flota no tiene vehículos para eliminar. *");
            System.out.println("**********************************************");
        } else {
            String matricula;
            System.out.print("\nIntroduce una matricula: ");
            matricula = teclado.nextLine();
            if (matricula.isEmpty()) {
                matricula = " ";
            }
            flota.removeVehiculo(matricula);
        }
    }

    /**
     * Método de la actividad 1.
     */
    void ejemploAA1() {
        /**
         * Indicamos el formato de fecha a la que vamos a convertir nuestros tipos String.
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        /**
         * 1. Crea un objeto de cada una de las clases Coche, Moto y Camión.
         */
        Coche coche1 = new Coche("1122ABC", "Audi", "TT", 2, 4);
        Moto moto1 = new Moto("2233LML", "Piaggio", "Liberty", 125);
        Camion camion1 = new Camion("3344HJK", "Renault", "Jumpy", 560);

        /**
         * 2. Crea dos objetos de tipo Cliente.
         */
        Cliente cliente1 = new Cliente("11222333A", "Ana");
        Cliente cliente2 = new Cliente("22333444B", "Josep");

        /**
         * 3. Crea tres contratos de alquiler, uno para cada tipo de vehículo, dos de los contratos tendrán el mismo cliente.
         */
        ContratoAlquiler contrato1 = new ContratoAlquiler(LocalDate.parse("15/11/2022", formatter), LocalDate.parse("25/11/2022", formatter), 100, coche1, cliente1);
        ContratoAlquiler contrato2 = new ContratoAlquiler(LocalDate.parse("30/03/2022", formatter), LocalDate.parse("04/04/2022", formatter), 60, moto1, cliente2);
        ContratoAlquiler contrato3 = new ContratoAlquiler(LocalDate.parse("16/07/2022", formatter), LocalDate.parse("05/08/2022", formatter), 250, camion1, cliente1);

        /**
         * 4. Utilizando los métodos toString, muestra por pantalla los datos de todos los objetos que has creado.
         */
        System.out.println("\nVEHÍCULOS: \n" + coche1.toString() + "\n" + moto1.toString() + "\n" + camion1.toString());
        System.out.println("\n///////////////////////////////////////////////////  \n");

        System.out.println("CLIENTES: \n" + cliente1 + "\n" + cliente2 + "\n");
        System.out.println("\n///////////////////////////////////////////////////  \n");

        System.out.println("\nCONTRATOS DE ALQUILER: \n" + "\nContrato 1" + contrato1
                + "\nContrato 2" + contrato2
                + "\nContrato 3" + contrato3);
    }
}
