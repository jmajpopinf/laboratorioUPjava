package laboratorioup;

import java.util.Scanner;

public class Monedero {
    private double saldo;
    
    private Monedero(double saldoInicial){
        if(saldoInicial>0.0){
            saldo=saldoInicial;
        }
    }
    
    public void establecerSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public double obtenerSaldo(){
        return saldo;
    }
    
    public void establecerAbono(double monto){
        saldo=saldo+monto;
    }
    
    public double obtenerAbono(){
        return saldo;
    }
    
    public void establecerRetiro(double retiro){
        if (retiro>saldo){
            System.out.printf("El monto a retirar es mayor al saldo\n");
        }
        else{
            saldo= saldo-retiro;
        }
    }
    
    public double obtenerRetiro(){
        return saldo;
    }
    
    public static void main(String[] args) {
        Monedero m1 = new Monedero(5000.00);
        
        Scanner entrada=new Scanner(System.in);
        
        double Abono;
        double Retiro;
        int opcion;
        
        do{
        System.out.print("\n--------MENU---------\n");
        System.out.print("1-Abonar\n");
        System.out.print("2-Retirar\n");
        System.out.print("3-Consultar saldo\n");
        System.out.print("4-Salir\n\n");
        
        System.out.print("Ingrese una opcion: ");
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                System.out.print("Escriba el monto a abonar en el Monedero: ");
                Abono = entrada.nextDouble();
                System.out.printf("\nSumando %.2f al Saldo del Monedero\n\n", Abono);
                m1.establecerAbono(Abono);
                break;
            
            case 2:
                System.out.print("RETIROS: \n");
                System.out.print("Escriba el monto a Retirar en el Monedero: ");
                Retiro = entrada.nextDouble();
                System.out.printf("\nRestando %.2f al Saldo del Monedero\n\n", Retiro);
                m1.establecerRetiro(Retiro);
                break;
            
            case 3:
                System.out.printf("Saldo de Monedero: $%.2f\n", m1.obtenerSaldo());
                break;       
        }
        }while(opcion!=4);
    }
}
