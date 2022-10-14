package lab1_kelvinmelgar;

import java.util.Scanner;

public class Lab1_KelvinMelgar {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistema de calculo de promedio--");
        System.out.print("Ingrese su nombre: ");//Se ingresa el nombre del usuario
        String nombre = leer.nextLine();
        
        //Se ingresan las notas de las cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = leer.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = leer.nextDouble();
        
        System.out.print("Ingrese la nota final de la Tercera clase: ");
        double terceraClase = leer.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = leer.nextDouble();
        
        //Se calcula el promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        //Se imprime el calculo del promedio
        System.out.println("--- " + nombre + " el promedio de las cuatro clases es de " + promedio + " ---");
        
        
    }
    
}
