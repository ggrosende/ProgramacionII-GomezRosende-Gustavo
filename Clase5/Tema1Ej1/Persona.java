public class Persona {
    private String nombre;
    private int DNI;
    private int edad;

    public Persona(String nombre, int DNI, int edad){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + ", de DNI: " + DNI + ", y tu edad es de: " + edad;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Gustavo", 38317309, 31);
        Persona p2 = new Persona("Juan Pablo", 39311597, 30);
        Persona p3 = new Persona("Juan", 44374029, 26);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
