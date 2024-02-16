
package eva1_7_metodos;


public class Persona {
    
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
        
        
        public String generarNombreCom(){
            return nombre + " " + apellido;
        }
        
        public int calcularAñoNac(){
            return 2024-edad;
        }
    
}
