// Estudiante: Jhonny Villanueva M.
package Plantas;

import java.util.Scanner;

public class Ornamentales extends Plantas {

    private String subEspecie;
    private String nombreComun;


    // Constructores:

    public Ornamentales() {
    }

    public Ornamentales(String subEspecie, String nombreComun) {
        this.subEspecie = subEspecie;
        this.nombreComun = nombreComun;
    }

    public Ornamentales(String nombreCientifico, String especie, int edadVida) {
        super(nombreCientifico, especie, edadVida);
    }

    public Ornamentales(String nombreCientifico, String especie, int edadVida, String subEspecie, String nombreComun) {
        super(nombreCientifico, especie, edadVida);
        this.subEspecie = subEspecie;
        this.nombreComun = nombreComun;
    }


    // Setter and Getter

    private String getSubEspecie() {
        return subEspecie;
    }

    public void setSubEspecie(String subEspecie) {
        this.subEspecie = subEspecie;
    }

    private String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }


    // Métodos:
    @Override
    public void imprimirDatos() {
        System.out.println("---- Planta Hornamental----");
        System.out.println("Nombre Común: " + getNombreComun());
        System.out.println("Sub Especie: " + getSubEspecie());
    }

    Scanner input = new Scanner(System.in);
    public void crearOrnamental() {
        System.out.println("\n> Registra los datos de una nueva Planta Ornamental");
        System.out.print(" >> Ingresa la Sub Especie: ");
        setSubEspecie(input.nextLine());
        System.out.print(" >> Ingresa el Nombre Común de la P. Ornamental: ");
        setNombreComun(input.nextLine());
    }
}
