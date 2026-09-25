package Clase6.Tema2Ej1;

public class Empleado {
    protected String nombre;
    protected int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public double calcularSueldo() {
        return 0;
    }

    static class EmpleadoAsalariado extends Empleado {

        private double sueldoBasico;
        private double bonus;

        public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bonus) {
            super(nombre, legajo);
            this.sueldoBasico = sueldoBasico;
            this.bonus = bonus;
        }

        @Override
        public double calcularSueldo() {

            return sueldoBasico + bonus;

        }
    }
    static class EmpleadoPorHora extends Empleado {

        public double horasTrabajadas;
        public double valorHora;

        public EmpleadoPorHora(String nombre, int legajo, double horasTrabajadas, double valorHora) {
            super(nombre, legajo);
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }

        @Override
        public double calcularSueldo() {
            return horasTrabajadas * valorHora;
        }
    }

    public static void main(String[] args){
        Empleado empleado1 = new EmpleadoAsalariado("Octavio", 45739, 850000, 90000);
        Empleado empleado2 = new EmpleadoPorHora("Lorenzo", 32919, 30, 40000);
        System.out.println(empleado1.calcularSueldo());
        System.out.println(empleado2.calcularSueldo());
    }
}


