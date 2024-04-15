package Aplicaciones;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);       
    float base, altura, area, perimetro;

    System.out.print("Ingrese un base : ");
    base = Float.parseFloat(teclado.nextLine());

    System.out.print("Ingrese un altura : ");
    altura = Float.parseFloat(teclado.nextLine());

    area = base * altura;
    perimetro = 2 * (base + altura);
    System.out.println("---Reporte---");
    System.out.println("------------");
    System.out.println("La Base es : " + base);
    System.out.println("La Altura es : " + altura);
    System.out.println("El Area es :" + area);
    System.out.println("El perimetro es : " + perimetro);
    
    }
}
