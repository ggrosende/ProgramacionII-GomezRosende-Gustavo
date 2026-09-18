public class EmpleadoPorHora extends Empleado {
    
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHora(String nombre, int legajo, double horasTrabajadas, double valorHora){
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
}
