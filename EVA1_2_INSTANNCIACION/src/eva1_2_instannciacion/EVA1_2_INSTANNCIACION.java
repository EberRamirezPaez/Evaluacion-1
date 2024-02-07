package eva1_2_instannciacion;


public class EVA1_2_INSTANNCIACION {

    
    public static void main(String[] args) {
        
        int valor = 100;
        
        Persona perso1 = new Persona();
        System.out.println(perso1);
        
        Vehiculo Shadow = new Vehiculo();
        System.out.println(Shadow);
        
        Shadow.marca = "Chrysler";
        Shadow.modelo = "Shadow";
        Shadow.año = 1999;
        System.out.println("marca: " + Shadow.marca);
        System.out.println("modelo: " + Shadow.modelo);
        System.out.println("año: " + Shadow.año);

    }
}


class Persona{
        
}

class Vehiculo{
    //atributos
    String marca;
    int año;
    String modelo;
}