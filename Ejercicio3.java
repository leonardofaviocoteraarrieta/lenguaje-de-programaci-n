package Aplicaciones;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);       
        float anchura, largura, area, precio;
        
        System.out.print("Ingrese la anchuhra : ");
        anchura = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Ingrese la largura : ");
        largura = Float.parseFloat(teclado.nextLine());
        
        area = anchura * largura;
        precio = area * 750;
        System.out.println("---Reporte---");
        System.out.println("------------");
        System.out.println("La Anchura es : " + anchura);
        System.out.println("La Largura es : " + largura);
        System.out.println("El Area es :" + area);
        System.out.println("El Precio es :" + precio);
    }
}
