
package eva1_5_clase_persona;


public class EVA1_5_CLASE_PERSONA {

  
    public static void main(String[] args) {
        
        
        Persona perso1 = new Persona();
        
        perso1.setNombre("Ramiro");
        perso1.setApellido("Tempestades");
        perso1.setNombre("455");
        

        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
 
        
    }
  
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
 
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    
    
}

