package eva1_3_modificadores_acceso;

import otro_gato.Otro_Otro_Gato;

public class EVA1_3_MODIFICADORES_ACCESO {
    public int x;
    protected int y;
    private int z;
    int w;
    

   
    public static void main(String[] args) {
        PruebaA objA = new PruebaA();
        
        Otro_Otro_Gato OtroPerro = new Otro_Otro_Gato();
            
        //PruebaB objB = new PruebaB();
    }
    
}





class PruebaA{
    public int x;
    protected int y;
    private int z;
    int w;
    
}