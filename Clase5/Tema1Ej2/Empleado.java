package Clase5.Tema1Ej2;
public class Empleado{
    private String nombre;
    private int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }
    public double calcularSueldo() {
        return 0;
    }
    public static void main(String[] args){
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new Empleado ("Gustavo Rosende", 23183);
        empleados[1] = new Empleado ("Juan Bonapelch", 25235); 
        
        mostrarLegajoMayorYMenor(empleados);
    }
    public static void mostrarLegajoMayorYMenor(Empleado[] array) {
        if(array == null || array.length == 0) {
            System.out.println("El arreglo esta vacio");
            return;
        }
        int legajoMayor = array[0].getLegajo();
        int legajoMenor = array[0].getLegajo();

        for(int i = 1; i < array.length; i++) {
            int legajoActual = array[i].getLegajo();
            if (legajoActual > legajoMayor) {
                legajoMayor = legajoActual;
            }
            if (legajoActual < legajoMenor) {
                legajoMenor = legajoActual;
            }
        }
        System.out.println("El legajo mayor es : " + legajoMayor);
        System.out.println("El legajo menor es: " + legajoMenor);
    }

}

