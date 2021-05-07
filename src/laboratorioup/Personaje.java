package laboratorioup;

public class Personaje {
    private String nombre;
    private String altura;
    private String peso;
    private String colorPiel;
    private String porcentajePoder;
    private String estado;
    
    public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerAltura(String altura){
        this.altura=altura;
    }
    
    public String obtenerAltura(){
        return altura;
    }
    
    public void establecerPeso(String peso){
        this.peso=peso;
    }
    
    public String obtenerPeso(){
        return peso;
    }
    
    public void establecerColorPiel(String colorPiel){
        this.colorPiel=colorPiel;
    }
    
    public String obtenerColorPiel(){
        return colorPiel;
    }
    
    public void establecerPorcentajePoder(String porcentajePoder){
        this.porcentajePoder=porcentajePoder;
    }
    
    public String obtenerPorcentajePoder(){
        return porcentajePoder;
    }
    
    public void establecerEstado(String estado){
        this.estado=estado;
    }
    
    public String obtenerEstado(){
        return estado;
    }
    
    //ACCIONES DEL PERSONAJE
    
    public void accionAtacar(){
        System.out.print("ESTA ATACANDO\n");
    }
    
    public void accionCorrer(){
        System.out.print("ESTA CORRIENDO\n");
    }
    
    public void accionSaltar(){
        System.out.print("ESTA SALTANDO\n");
    }
    
    public void accionEsquivar(){
        System.out.print("ESTA ESQUIVANDO\n");
    }
    
    public void accionMorir(){ 
        System.out.print("ESTA MUERTO\n");
    }
    
    public void resumen(){
        System.out.print("\nPERSONAJE\n");
        System.out.print("\n--------------------------\n");
        System.out.printf("Nombre: %s\n", obtenerNombre());
        System.out.printf("Altura: %s\n", obtenerAltura());
        System.out.printf("Peso: %s\n", obtenerPeso());
        System.out.printf("Color de Piel: %s\n", obtenerColorPiel());
        System.out.printf("Pocentaje de Poder: %s\n", obtenerPorcentajePoder());
        System.out.printf("Estado: %s\n", obtenerEstado());
    }
}
