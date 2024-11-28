// Estudiante: Jhonny Villanueva M.
package Plantas;

public class Arces extends Arboles{

    private String nombreArce;
    private String rangoTemperatura;

    // Constructores:

    public Arces(String nombre, String colorHojas, double tamanoMax, String nombreArce, String rangoTemperatura) {
        super(nombre, colorHojas, tamanoMax);
        this.nombreArce = nombreArce;
        this.rangoTemperatura = rangoTemperatura;
    }

    // Setter and Getter

    private String getNombreArce() {
        return nombreArce;
    }

    public void setNombreArce(String nombreArce) {
        this.nombreArce = nombreArce;
    }

    private String getRangoTemperatura() {
        return rangoTemperatura;
    }

    public void setRangoTemperatura(String rangoTemperatura) {
        this.rangoTemperatura = rangoTemperatura;
    }

    // Métodos
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre Arce: " + getNombreArce());
        System.out.println("Rango Temperatura: " + getRangoTemperatura());
    }
}
