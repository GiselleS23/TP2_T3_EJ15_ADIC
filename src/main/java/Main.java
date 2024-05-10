/* 15- Escriba un diagrama que muestre la tabla ASCII.
Sacchetti, Maria Giselle C2*/

/* 32 (el primer carácter imprimible en la tabla ASCII) y terminamos en 126 (el último carácter imprimible en la tabla ASCII). */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    for (int i = 32; i <= 126; i++) {
        System.out.printf("%-5d%-5c\n", i, (char) i);
    }
    scanner.close();

  }

}
