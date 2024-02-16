
package eva1_7_metodos;
import java.util.Scanner;


public class EVA1_7_METODOS {


    public static void main(String[] args) {
        
        Persona perso = new Persona();
        perso.setNombre("Ramiro");
        perso.setApellido("Ramirez");
        perso.setEdad(22);
        
        System.out.println("El nombre es " + perso.generarNombreCom());
        System.out.println("Nacio en el año: " + perso.calcularAñoNac());
        
        Persona[] grupo = new Persona[10];
        
        for(int i = 0 ;i < grupo.length; i++){
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            
            System.out.println("Introduce el Nombre: ");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el Apellido: ");
            String ape = input.nextLine();
            grupo[i].setApellido(ape);
            
            System.out.println("Introduce la Edad: ");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);                    
        }
        
        for(int i = 0; i < grupo.length; i++) {
            System.out.println("El nombre es: " + perso.generarNombreCom());
            System.out.println("Nacio en el año: " + perso.calcularAñoNac());
            
        }

        
    }
    
}
