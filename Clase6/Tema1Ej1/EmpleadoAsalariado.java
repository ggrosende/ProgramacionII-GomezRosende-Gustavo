package Clase6.Tema1Ej1;

public class EmpleadoAsalariado extends Empleado{

    private double sueldoBasico;
    private double bonus;

    public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bonus){
        super(nombre, legajo);
        this.sueldoBasico = sueldoBasico;
        this.bonus = bonus;
    }

    @Override
    public double calcularSueldo(){

        return sueldoBasico + bonus;

    }

    public static void main(String[] args){
        Empleado empleado = new EmpleadoAsalariado("Juan", 45460, 800000, 75000);
        System.out.println("Su salario es de :$"+ empleado.calcularSueldo());
    }
}