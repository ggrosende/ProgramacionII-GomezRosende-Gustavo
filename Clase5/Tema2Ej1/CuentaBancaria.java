package Clase5.Tema2Ej1;

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
}
