import Plantas.Plantas;
import Plantas.Ornamentales;
import Plantas.Arboles;
import Plantas.Sauces;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hola, bienvenido al inventario botánico\n");

        System.out.println("> Crea una nueva planta:");
        Plantas planta2 = new Plantas();
        planta2.crearPlanta();
        Ornamentales pOrnamental1 = new Ornamentales();
        pOrnamental1.crearOrnamental();
        Arboles arbol1 = new Arboles();
        arbol1.crearArbol();
        Sauces sauce1 = new Sauces();
        sauce1.crearSauce();


        System.out.println("\n> Los datos de la planta que ingresaste son:");
        planta2.imprimirDatos();
        pOrnamental1.imprimirDatos();
        arbol1.imprimirDatos();
        sauce1.imprimirDatos();

    }
}