/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perúbank;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Persona {
    private static double saldo = 0;
    Scanner s=new Scanner(System.in);
    public void retirarDinero() {
        System.out.print("Ingrese la cantidad que desea retirar: ");
        double cantidad = s.nextDouble();
        
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso.");
            System.out.println("Su nuevo saldo es: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void depositarDinero() {
        System.out.print("Ingrese la cantidad que desea depositar: ");
        double cantidad = s.nextDouble();
        
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso.");
            System.out.println(" Su nuevo saldo es: " + saldo);
        } else {
            System.out.println("Cantidad no valida.");
        }
    }
    
    public void consultarSaldo() {
        System.out.println("Su saldo actual es: " + saldo);
        System.out.println("ooooooooooooooooooooooooooooooooo");
    }
}
