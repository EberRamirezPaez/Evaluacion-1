package eva1_4_modificadores_acceso;

import Paquete_2.B;


public class EVA1_4_MODIFICADORES_ACCESO {

    public static void main(String[] args) {
        
        
        One obil = new One();
        
        //System.out.println(obil); --> la clase A esvisible para la calse A
        
        B objB = new B();
        
        // Two obi1 = new Tow(); --> esta calse no la podemos usar por su modificadorde acceso al ser modificador defaul

   
    
    }
    
}

class One{
    
}