package Clase5.Tema2Ej2;

public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int numeroCuenta, double saldoInicial) {
        setTitular(titular);
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldoInicial); 
    }
    public String getTitular(){
        return titular;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        if(titular == null || titular.length() == 0){
            throw new IllegalArgumentException("El nombre del titular no puede estar vacio.");
        }
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        if(saldo < 0){
            throw new IllegalArgumentException("El saldo no puede ser un número negativo.");
        }
        this.saldo = saldo;
    }

    public void deposito(double monto){
        if(monto <= 0){
            throw new IllegalArgumentException("El monto a depositar no puede ser 0 o debajo de 0");
        }
        this.saldo+= monto;
        System.out.println("Depósito realizado, usted ingresó: $" + monto + ". Su saldo actual es de: $" + this.saldo);
    }
    public void extraer(double monto){
        if(monto <= 0){
            throw new IllegalArgumentException("El monto a extraer no puede ser 0 o debajo de 0");
        }
        if(monto > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente:");
        }
        this.saldo-= monto;
        System.out.println("Extracción realizada, usted extrajo: $ " + monto + ". Su saldo actual es de: $" + this.saldo);
    }
    public class void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria(1000);
    }
}
