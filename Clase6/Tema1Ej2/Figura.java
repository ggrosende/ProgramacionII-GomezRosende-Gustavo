package Clase6.Tema1Ej2;

public class Figura {
    public String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public double calcularArea(){
        return 0;
    }

    /*Al no poder utilizar aún la clase "abstract", Figura se mantiene como
    * una clase instanciable y concreta, decidiendo asi no impedir su instanciación. */

    static class Circulo extends Figura {
        private final double radio;

        public Circulo(double radio) {
            super("Círculo");
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }
    static class Rectangulo extends Figura {
        private final double base;
        private final double altura;

        public Rectangulo(double base, double altura) {
            super("Rectángulo");
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }
    public static void main(String[] args){
        Figura figura1 = new Circulo(89);
        Figura figura2 = new Rectangulo(45, 90);
        System.out.println(figura2.calcularArea());
        System.out.println(figura1.calcularArea());
    }
}

