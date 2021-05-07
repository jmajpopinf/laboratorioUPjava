package laboratorioup;
import java.util.Scanner;

public class Taller extends Vehiculo{
    public static void main(String[] args) {
        Vehiculo c1=new Vehiculo();
        Vehiculo c2=new Vehiculo();
        Vehiculo c3=new Vehiculo();
        Vehiculo c4=new Vehiculo();
        Vehiculo c5=new Vehiculo();
        
        Scanner entrada=new Scanner(System.in);
        String Caracter;
        int conteo=0;
        
        System.out.print("\nINGRESE DATOS VEHICULO 1\n");
        System.out.print("Ingrese marca del vehiculo : ");
        Caracter = entrada.nextLine();
        c1.establecerMarca(Caracter);
        
        System.out.print("Ingrese color del vehiculo : ");
        Caracter = entrada.nextLine();
        c1.establecerColor(Caracter);
        
        System.out.print("Ingrese chasis del vehiculo : ");
        Caracter = entrada.nextLine();
        c1.establecerChasis(Caracter);
        
        System.out.print("Ingrese motor del vehiculo : ");
        Caracter = entrada.nextLine();
        c1.establecerMotor(Caracter);
        
        System.out.print("Ingrese frenos del vehiculo : ");
        Caracter = entrada.nextLine();
        c1.establecerFrenos(Caracter);
        
        System.out.print("\nINGRESE DATOS VEHICULO 2\n");
        System.out.print("Ingrese marca del vehiculo : ");
        Caracter = entrada.nextLine();
        c2.establecerMarca(Caracter);
        
        System.out.print("Ingrese color del vehiculo : ");
        Caracter = entrada.nextLine();
        c2.establecerColor(Caracter);
        
        System.out.print("Ingrese chasis del vehiculo : ");
        Caracter = entrada.nextLine();
        c2.establecerChasis(Caracter);
        
        System.out.print("Ingrese motor del vehiculo : ");
        Caracter = entrada.nextLine();
        c2.establecerMotor(Caracter);
        
        System.out.print("Ingrese frenos del vehiculo : ");
        Caracter = entrada.nextLine();
        c2.establecerFrenos(Caracter);
        
        System.out.print("\nINGRESE DATOS VEHICULO 3\n");
        System.out.print("Ingrese marca del vehiculo : ");
        Caracter = entrada.nextLine();
        c3.establecerMarca(Caracter);
        
        System.out.print("Ingrese color del vehiculo : ");
        Caracter = entrada.nextLine();
        c3.establecerColor(Caracter);
        
        System.out.print("Ingrese chasis del vehiculo : ");
        Caracter = entrada.nextLine();
        c3.establecerChasis(Caracter);
        
        System.out.print("Ingrese motor del vehiculo : ");
        Caracter = entrada.nextLine();
        c3.establecerMotor(Caracter);
        
        System.out.print("Ingrese frenos del vehiculo : ");
        Caracter = entrada.nextLine();
        c3.establecerFrenos(Caracter);
        
        System.out.print("\nINGRESE DATOS VEHICULO 4\n");
        System.out.print("Ingrese marca del vehiculo : ");
        Caracter = entrada.nextLine();
        c4.establecerMarca(Caracter);
        
        System.out.print("Ingrese color del vehiculo : ");
        Caracter = entrada.nextLine();
        c4.establecerColor(Caracter);
        
        System.out.print("Ingrese chasis del vehiculo : ");
        Caracter = entrada.nextLine();
        c4.establecerChasis(Caracter);
        
        System.out.print("Ingrese motor del vehiculo : ");
        Caracter = entrada.nextLine();
        c4.establecerMotor(Caracter);
        
        System.out.print("Ingrese frenos del vehiculo : ");
        Caracter = entrada.nextLine();
        c4.establecerFrenos(Caracter);
        
        System.out.print("\nINGRESE DATOS VEHICULO 5\n");
        System.out.print("Ingrese marca del vehiculo : ");
        Caracter = entrada.nextLine();
        c5.establecerMarca(Caracter);
        
        System.out.print("Ingrese color del vehiculo : ");
        Caracter = entrada.nextLine();
        c5.establecerColor(Caracter);
        
        System.out.print("Ingrese chasis del vehiculo : ");
        Caracter = entrada.nextLine();
        c5.establecerChasis(Caracter);
        
        System.out.print("Ingrese motor del vehiculo : ");
        Caracter = entrada.nextLine();
        c5.establecerMotor(Caracter);
        
        System.out.print("Ingrese frenos del vehiculo : ");
        Caracter = entrada.nextLine();
        c5.establecerFrenos(Caracter);
        
        System.out.print("\n\n------------------------");
        System.out.print("\nDATOS VEHICULO 1\n");
        System.out.print("------------------------\n");
        c1.resumenV();
        
        System.out.print("\n\n------------------------");
        System.out.print("\nDATOS VEHICULO 2\n");
        System.out.print("------------------------\n");
        c2.resumenV();
        
        System.out.print("\n\n------------------------");
        System.out.print("\nDATOS VEHICULO 3\n");
        System.out.print("------------------------\n");
        c3.resumenV();
        
        System.out.print("\n\n------------------------");
        System.out.print("\nDATOS VEHICULO 4\n");
        System.out.print("------------------------\n");
        c4.resumenV();
        
        System.out.print("\n\n------------------------");
        System.out.print("\nDATOS VEHICULO 5\n");
        System.out.print("------------------------\n");
        c5.resumenV();
    }
}


