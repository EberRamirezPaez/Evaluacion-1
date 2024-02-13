package eva1_6_veiculo;

public class EVA1_6_VEICULO {

    
    public static void main(String[] args) {
        
        Veiculo carro1 = new Veiculo();
                
        carro1.setMarca("Chrysler");
        carro1.setModelo("Shadow");
        carro1.setAño(1999);
        carro1.setColor("Purpura");
        carro1.setPrecio(45500);

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Año: " + carro1.getAño());
        System.out.println("Color: " + carro1.getColor());
        System.out.println("Precio: " + carro1.getPrecio());
        
    }
    
}
