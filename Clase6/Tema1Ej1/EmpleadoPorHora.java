package Clase6.Tema1Ej1;
public class EmpleadoPorHora extends Empleado {
    
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHora(String nombre, int legajo, double horasTrabajadas, double valorHora){
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    @Override 
    public double calcularSueldo(){
        return horasTrabajadas*valorHora;
    }
    public static void main(String [] args) {
        Empleado empleado = new EmpleadoPorHora( "Gustavo", 31254, 35, 56000);
        System.out.println("Su Salario es de $ " + empleado.calcularSueldo());
    }
}
