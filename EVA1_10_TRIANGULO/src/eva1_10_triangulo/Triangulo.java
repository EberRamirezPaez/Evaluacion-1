package eva1_10_triangulo;

public class Triangulo {
    
    private double base;
    private double altura;
    
    public Triangulo(){
        
        base = -1;
        altura = -1;
        
    }
    
    //Metodos get set
    
    
        public double getBase(){
            return base;
        }
        public void setBase(double valor){
            base = valor;
        }
        
        
        public double getAltura(){
            return altura;
        }
        public void setAltura(double valor){
            altura = valor;
        }
        
        
        private double calcularArea(){
            return (base * altura) /2;
        }
        private double calcularPerimetro(){
            double peri;
            double h;
            
            h = Math.sqrt((base * base)+(altura * altura));
            
            peri = altura + base + h ;
                    
            return peri;
        }
        
        
        public void imprimirDatos(){
            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);
            System.out.println("El area del triangulo es: " + calcularArea());
            System.out.println("El perimetro del triangulo es: " + calcularPerimetro());
        }
}
