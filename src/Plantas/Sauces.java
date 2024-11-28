// Estudiante: Jhonny Villanueva M.
package Plantas;

import java.util.Scanner;

public class Sauces extends Arboles{

    private String rangoTemperatura;

    // Constructores:

    public Sauces() {
    }

    public Sauces(String nombre, String colorHojas, double tamanoMax, String rangoTemperatura) {
        super(nombre, colorHojas, tamanoMax);
        this.rangoTemperatura = rangoTemperatura;
    }

    // Getter and Setter


    private String getRangoTemperatura() {
        return rangoTemperatura;
    }

    public void setRangoTemperatura(String rangoTemperatura) {
        this.rangoTemperatura = rangoTemperatura;
    }

    // Métodos:

    @Override
    public void imprimirDatos(){
        System.out.println("Crece en regiones con temperaturas entre: " + getRangoTemperatura() + " °C");
    }

    Scanner input = new Scanner(System.in);
    public void crearSauce(){
        System.out.println("\n> Registra los datos de una especie Sauce");
        System.out.print(">> Ingresa el rango de temperatura en el que crece: ");
        setRangoTemperatura(input.nextLine());
    }
}
