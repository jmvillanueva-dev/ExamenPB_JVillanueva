// Estudiante: Jhonny Villanueva M.
package Plantas;

import java.util.Scanner;

public class Arboles extends Ornamentales {

    private String nombre;
    private String colorHojas;
    private double tamanoMax;

    // Constructores

    public Arboles() {
    }

    public Arboles(String nombre, String colorHojas, double tamanoMax) {
        this.nombre = nombre;
        this.colorHojas = colorHojas;
        this.tamanoMax = tamanoMax;
    }

    public Arboles(String subEspecie, String nombreComun, String nombre, String colorHojas, double tamanoMax) {
        super(subEspecie, nombreComun);
        this.nombre = nombre;
        this.colorHojas = colorHojas;
        this.tamanoMax = tamanoMax;
    }

    // Setter and Getter

    private String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    private double getTamanoMax() {
        return tamanoMax;
    }

    public void setTamanoMax(double tamanoMax) {
        this.tamanoMax = tamanoMax;
    }

    // Métodos:

    @Override
    public void imprimirDatos() {
        System.out.println("---- Datos Árbol Hornamental ----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("ColorHojas: " + getColorHojas());
        System.out.println("TamanoMax: " + getTamanoMax());
    }

    Scanner input = new Scanner(System.in);
    public void crearArbol() {
        System.out.println("\n> Registra los datos de un nuevo Arbol Ornamental");
        System.out.print(" >> Ingresa el Nombre del Arbol: ");
        setNombre(input.nextLine());
        System.out.print(" >> Ingresa el color de las hojas del Arbol: ");
        setColorHojas(input.nextLine());
        System.out.print(" >> Ingresa el Tamaño del Arbol: ");
        setTamanoMax(Double.parseDouble(input.nextLine()));
    }
}

