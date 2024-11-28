// Estudiante: Jhonny Villanueva M.
package Plantas;

import java.util.Scanner;

public class Plantas {

    private String nombreCientifico;
    private String especie;
    private int edadVida;


    // Constructores:

    public Plantas(String nombreCientifico, String especie, int edadVida) {
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
        this.edadVida = edadVida;
    }

    public Plantas() {
    }

    // Setter and Getter:

    private String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    private String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    private int getEdadVida() {
        return edadVida;
    }

    public void setEdadVida(int edadVida) {
        this.edadVida = edadVida;
    }

    // Métodos:
    public void imprimirDatos() {
        System.out.println("[----- DATOS PLANTA: -----]");
        System.out.println("Nombre Científico: " + getNombreCientifico());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Edad Vida: " + getEdadVida());
    }

    Scanner input = new Scanner(System.in);
    public void crearPlanta() {
        System.out.println("\n> Registra los datos de una nueva planta");
        System.out.print(" >> Ingrese el nombre científico del planta: ");
        setNombreCientifico(input.nextLine());
        System.out.print(" >> Ingrese el especie del planta: ");
        setEspecie(input.nextLine());
        System.out.print(" >> Ingrese el edad del planta: ");
        setEdadVida(Integer.parseInt(input.nextLine()));
    }
}
