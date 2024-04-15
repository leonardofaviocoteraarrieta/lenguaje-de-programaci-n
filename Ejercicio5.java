package Aplicaciones;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float radio, altura, area, volumen;
        
        System.out.print("Ingrese la radio: ");
        radio = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Ingrese la altura: ");
        altura = Float.parseFloat(teclado.nextLine());
        
        area = (float)(2 * Math.PI * radio * (radio + altura));
        volumen = (float) (Math.PI*(radio*radio)*altura);
        
        System.out.println("--------Reporte--------");
        System.out.println("El are de cilindro es : " + area);
        System.out.println("El volmen es : " +volumen);
        System.out.println("-----------------------");
        
        
        
        
    }
    
}
