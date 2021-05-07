package laboratorioup;

import java.util.Scanner;

public class PruebaPersonaje extends Personaje{
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje();
        Personaje personaje2 = new Personaje();
        Personaje personaje3 = new Personaje();
        Personaje personaje4 = new Personaje();
        
        Scanner entrada = new Scanner(System.in);
        String caracter;
        
        //PERSONAJE 1
        
        System.out.print("DATOS PERSONAJE 1\n");
        
        System.out.print("Ingrese nombre: ");
        caracter = entrada.next();
        personaje1.establecerNombre(caracter);
        
        System.out.print("Ingrese Altura: ");
        caracter = entrada.next();
        personaje1.establecerAltura(caracter);
        
        System.out.print("Ingrese peso: ");
        caracter = entrada.next();
        personaje1.establecerPeso(caracter);
        
        System.out.print("Ingrese color de piel: ");
        caracter = entrada.next();
        personaje1.establecerColorPiel(caracter);
        
        System.out.print("Ingrese porcentaje de poder: ");
        caracter = entrada.next();
        personaje1.establecerPorcentajePoder(caracter);
        
        System.out.print("Ingrese estado: ");
        caracter = entrada.next();
        personaje1.establecerEstado(caracter);
        
        int opcion;
            
        System.out.print("\nACCIONES DEL PERSONAJE\n");
        System.out.print("1-Atacar\n");
        System.out.print("2-Correr\n");
        System.out.print("3-Saltar\n");
        System.out.print("4-Esquivar\n");
        System.out.print("5-Morir\n");
            
        System.out.print("\nIngrese accion para el personaje: ");
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                personaje1.resumen();
                System.out.print("--------------------------\n");
                personaje1.accionAtacar();
                System.out.print("--------------------------\n");
                break;
            case 2:
                personaje1.resumen();
                System.out.print("--------------------------\n");
                personaje1.accionCorrer();
                System.out.print("--------------------------\n");
                break;
            case 3:
                personaje1.resumen();
                System.out.print("--------------------------\n");
                personaje1.accionSaltar();
                System.out.print("--------------------------\n");
                break;
            case 4:
                personaje1.resumen();
                System.out.print("--------------------------\n");
                personaje1.accionEsquivar();
                System.out.print("--------------------------\n");
                break;
            case 5:
                personaje1.resumen();
                System.out.print("--------------------------\n");
                personaje1.accionMorir();
                System.out.print("--------------------------\n");
                break; 
        }
        
        //PERSONAJE 2
        
        System.out.print("DATOS PERSONAJE 2\n");
        
        System.out.print("Ingrese nombre: ");
        caracter = entrada.next();
        personaje2.establecerNombre(caracter);
        
        System.out.print("Ingrese Altura: ");
        caracter = entrada.next();
        personaje2.establecerAltura(caracter);
        
        System.out.print("Ingrese peso: ");
        caracter = entrada.next();
        personaje2.establecerPeso(caracter);
        
        System.out.print("Ingrese color de piel: ");
        caracter = entrada.next();
        personaje2.establecerColorPiel(caracter);
        
        System.out.print("Ingrese porcentaje de poder: ");
        caracter = entrada.next();
        personaje2.establecerPorcentajePoder(caracter);
        
        System.out.print("Ingrese estado: ");
        caracter = entrada.next();
        personaje2.establecerEstado(caracter);
            
        System.out.print("\nACCIONES DEL PERSONAJE\n");
        System.out.print("1-Atacar\n");
        System.out.print("2-Correr\n");
        System.out.print("3-Saltar\n");
        System.out.print("4-Esquivar\n");
        System.out.print("5-Morir\n");
            
        System.out.print("\nIngrese accion para el personaje: ");
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                personaje2.resumen();
                System.out.print("--------------------------\n");
                personaje2.accionAtacar();
                System.out.print("--------------------------\n");
                break;
            case 2:
                personaje2.resumen();
                System.out.print("--------------------------\n");
                personaje2.accionCorrer();
                System.out.print("--------------------------\n");
                break;
            case 3:
                personaje2.resumen();
                System.out.print("--------------------------\n");
                personaje2.accionSaltar();
                System.out.print("--------------------------\n");
                break;
            case 4:
                personaje2.resumen();
                System.out.print("--------------------------\n");
                personaje2.accionEsquivar();
                System.out.print("--------------------------\n");
                break;
            case 5:
                personaje2.resumen();
                System.out.print("--------------------------\n");
                personaje2.accionMorir();
                System.out.print("--------------------------\n");
                break;    
        }
        
        //PERSONAJE 3
        
        System.out.print("DATOS PERSONAJE 3\n");
        
        System.out.print("Ingrese nombre: ");
        caracter = entrada.next();
        personaje3.establecerNombre(caracter);
        
        System.out.print("Ingrese Altura: ");
        caracter = entrada.next();
        personaje3.establecerAltura(caracter);
        
        System.out.print("Ingrese peso: ");
        caracter = entrada.next();
        personaje3.establecerPeso(caracter);
        
        System.out.print("Ingrese color de piel: ");
        caracter = entrada.next();
        personaje3.establecerColorPiel(caracter);
        
        System.out.print("Ingrese porcentaje de poder: ");
        caracter = entrada.next();
        personaje3.establecerPorcentajePoder(caracter);
        
        System.out.print("Ingrese estado: ");
        caracter = entrada.next();
        personaje3.establecerEstado(caracter);
            
        System.out.print("\nACCIONES DEL PERSONAJE\n");
        System.out.print("1-Atacar\n");
        System.out.print("2-Correr\n");
        System.out.print("3-Saltar\n");
        System.out.print("4-Esquivar\n");
        System.out.print("5-Morir\n");
            
        System.out.print("\nIngrese accion para el personaje: ");
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                personaje3.resumen();
                System.out.print("--------------------------\n");
                personaje3.accionAtacar();
                System.out.print("--------------------------\n");
                break;
            case 2:
                personaje3.resumen();
                System.out.print("--------------------------\n");
                personaje3.accionCorrer();
                System.out.print("--------------------------\n");
                break;
            case 3:
                personaje3.resumen();
                System.out.print("--------------------------\n");
                personaje3.accionSaltar();
                System.out.print("--------------------------\n");
                break;
            case 4:
                personaje3.resumen();
                System.out.print("--------------------------\n");
                personaje3.accionEsquivar();
                System.out.print("--------------------------\n");
                break;
            case 5:
                personaje3.resumen();
                System.out.print("--------------------------\n");
                personaje3.accionMorir();
                System.out.print("--------------------------\n");
                break;    
        }
        
        //PERSONAJE 4
        
        System.out.print("DATOS PERSONAJE 4\n");
        
        System.out.print("Ingrese nombre: ");
        caracter = entrada.next();
        personaje4.establecerNombre(caracter);
        
        System.out.print("Ingrese Altura: ");
        caracter = entrada.next();
        personaje4.establecerAltura(caracter);
        
        System.out.print("Ingrese peso: ");
        caracter = entrada.next();
        personaje4.establecerPeso(caracter);
        
        System.out.print("Ingrese color de piel: ");
        caracter = entrada.next();
        personaje4.establecerColorPiel(caracter);
        
        System.out.print("Ingrese porcentaje de poder: ");
        caracter = entrada.next();
        personaje4.establecerPorcentajePoder(caracter);
        
        System.out.print("Ingrese estado: ");
        caracter = entrada.next();
        personaje4.establecerEstado(caracter);
            
        System.out.print("\nACCIONES DEL PERSONAJE\n");
        System.out.print("1-Atacar\n");
        System.out.print("2-Correr\n");
        System.out.print("3-Saltar\n");
        System.out.print("4-Esquivar\n");
        System.out.print("5-Morir\n");
            
        System.out.print("\nIngrese accion para el personaje: ");
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                personaje4.resumen();
                System.out.print("--------------------------\n");
                personaje4.accionAtacar();
                System.out.print("--------------------------\n");
                break;
            case 2:
                personaje4.resumen();
                System.out.print("--------------------------\n");
                personaje4.accionCorrer();
                System.out.print("--------------------------\n");
                break;
            case 3:
                personaje4.resumen();
                System.out.print("--------------------------\n");
                personaje4.accionSaltar();
                System.out.print("--------------------------\n");
                break;
            case 4:
                personaje4.resumen();
                System.out.print("--------------------------\n");
                personaje4.accionEsquivar();
                System.out.print("--------------------------\n");
                break;
            case 5:
                personaje4.resumen();
                System.out.print("--------------------------\n");
                personaje4.accionMorir();
                System.out.print("--------------------------\n");
                break;    
        }
    }
}
