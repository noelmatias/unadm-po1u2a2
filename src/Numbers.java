// ISO-8859-1 encoding
import java.util.Scanner;

public class Numbers {
    static String[] menu = {
            "1.- Registrar número:",
            "2.- Es capicúa:",
            "3.- Es primo:",
            "4.- Elevado al cuadrado su producto es:",
            "5.- Salir."
    };

    public static void main(String[] args) {
        // Set class for user input
        Scanner userInput = new Scanner(System.in);
        boolean running = true;
        while (running){
            // Print menu
            byte i;
            for (i = 0; i < menu.length; i++){
                System.out.println(menu[i]);
            }

            byte menuItem = userInput.nextByte();
            switch (menuItem) {
                case 1 -> System.out.println(menu[0]);
                case 2 -> System.out.println(menu[1]);
                case 3 -> System.out.println(menu[2]);
                case 4 -> System.out.println(menu[3]);
                case 5 -> running = false;
                default -> System.out.println("Entrada no válida");
            }
        }
    }
}
