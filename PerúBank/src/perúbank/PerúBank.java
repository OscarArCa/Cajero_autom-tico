/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perúbank;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class PerúBank {

    
    public static void main(String[] args) {
        Persona m = new Persona();
        Scanner s = new Scanner(System.in);
        int opcion,contrasenia;
        int verifica,intentos=3;
        String nombre;
        while (true) {
            intentos=3;
            System.out.println("Registre su Nombre: ");
                nombre = s.nextLine();
                System.out.println("-------------------------------------------------------------------");
            try {
                
                System.out.println("Registre su contrasenia: ");
                verifica = s.nextInt();
                System.out.println("-------------------------------------------------------------------");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ingrese su contasenia: ");
                    contrasenia = s.nextInt();
                    System.out.println("-------------------------------------------------------------------");
                    if (contrasenia == verifica) {
                        do {
                            System.out.println("Bienvenido al Cajero PeruBank");
                            System.out.println("1. Retirar dinero");
                            System.out.println("2. Depositar dinero");
                            System.out.println("3. Consultar saldo");
                            System.out.println("4. Cerrar cuenta");
                            System.out.println("5. Apagar cajero");
                            System.out.print("Seleccione una opcion: ");
                            opcion = s.nextInt();
                            System.out.println("-------------------------------------------------------------------");
                            switch (opcion) {
                                case 1 :
                                    m.retirarDinero();
                                    System.out.println("-------------------------------------------------------------------");break;
                                case 2 :
                                    m.depositarDinero();
                                    System.out.println("-------------------------------------------------------------------");break;
                                case 3 :
                                    System.out.println("Usuario: "+nombre);
                                    m.consultarSaldo();
                                    System.out.println("-------------------------------------------------------------------");break;
                                case 4 :
                                    System.out.println("Gracias por ser parte de Perubank. ¡Hasta luego!");break;
                                case 5:
                                    System.out.println("Apagando...!!!");
                                    System.exit(0);
                                default :
                                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");break;
                            }
                        } while (opcion != 4);
                    } else {
                        intentos -= 1;
                        System.out.println("Contrasenia equivocada le quedan " + (intentos) + " intentos");
                        if (i + 1 == 3) {
                            System.out.println("Usted a llegado al limite de intentos, ya no podra acceder por un tiempo.");
                        }
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Este valor no es valido.");
                System.exit(0);
            }
        }
        
        
        
        
    }
    
    
}
