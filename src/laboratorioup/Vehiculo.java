package laboratorioup;

public class Vehiculo {
    private String marca;
    private String color;
    private String chasis;
    private String motor;
    private String frenos;
    
    public void establecerMarca(String marca){
        this.marca=marca;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
     public void establecerColor(String color){
        this.color=color;
    }
    
    public String obtenerColor(){
        return color;
    }
    
    public void establecerChasis(String chasis){
        this.chasis=chasis;
    }
    
    public String obtenerChasis(){
        return chasis;
    }
    
    public void establecerMotor(String motor){
        this.motor=motor;
    }
    
    public String obtenerMotor(){
        return motor;
    }
    
    public void establecerFrenos(String frenos){
        this.frenos=frenos;
    }
    
    public String obtenerFrenos(){
        return frenos;
    }
    
    public void resumenV(){
        System.out.printf("Marca Vehiculo : %s\n", obtenerMarca());
        System.out.printf("Color Vehiculo : %s\n", obtenerColor());
        System.out.printf("Chasis Vehiculo : %s\n",obtenerChasis());
        System.out.printf("Motor Vehiculo : %s\n", obtenerMotor());
        System.out.printf("Frenos Vehiculo : %s\n", obtenerFrenos());
    }
}
