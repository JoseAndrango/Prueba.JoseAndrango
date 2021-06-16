
package test;

import dominio.Estudiantes;
import java.util.Scanner;

public class PruebaEstudiantes {
    static Scanner datos = new Scanner(System.in);
    public static void main(String[] args){
       // int [] numeros = new int[3]; 
        Estudiantes []  nombres;
        int n=3;
        nombres = new Estudiantes[n];
        llenaDatos(nombres);
        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);//por el metodo tostring 
        }
        
    }
    public static void llenaDatos(Estudiantes nom[]) { //definido el array 
        String nombres;
        char gener;
        double nota;
        for(int i=0;i<nom.length;i++){
            System.out.print("nombre:");
            nombres = datos.nextLine(); //definir ue este preoceso es estatico 
            System.out.print("genero: ");
            gener = datos.hasNextLine();
            System.out.print("nota:");
            nota = datos.nextDouble();
            nom[i] = new Estudiantes(nombres,gener,nota); //guarda en un array los objetos 
            datos.nextLine();
        }
        
    }
}
