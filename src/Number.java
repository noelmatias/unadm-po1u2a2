// ISO-8859-1 encoding
import java.util.Scanner;

public class Number {
    static String[] menu = {
            "1.- Registrar número:",
            "2.- Es capicúa:",
            "3.- Es primo:",
            "4.- Elevado al cuadrado su producto es:",
            "5.- Salir.",
    };

    static String noNum = "No se ha ingresado un número";

    static boolean isPalindromic(String strNum){
        int strLen = strNum.length();

        if (strLen < 2) return true;

        if (strNum.charAt(0) == strNum.charAt(strLen - 1)) {
            return isPalindromic(strNum.substring(1, strLen - 1));
        }

        return false;
    }

    static boolean isPrime(String strNum){
        int n = Integer.parseInt(strNum);

        if (n == 1) {
        }
        return false;
    }

    static long squareNum(String strNum){
        return 1;
    }

    public static void main(String[] args) {
        /* User input */
        Scanner userInput = new Scanner(System.in);
        String inputNum = "";

        /* Runtime */
        boolean running = true;
        while (running){

            /* Print menu */
            for (int i = 0; i < menu.length; i++){
                System.out.println(menu[i]);
            }

            /* User selection */
            byte menuItem = (byte) userInput.nextInt();
            switch (menuItem) {
                case 1 -> {
                    System.out.println(menu[0]);
                    inputNum = userInput.next();
                    userInput.nextLine();
                }
                case 2 -> {
                    System.out.println(menu[1]);
                    if (inputNum.isBlank()) {
                        System.out.println(noNum);
                        break;
                    }

                    System.out.println(
                            isPalindromic(inputNum) ? "Sí" : "No"
                    );
                }
                case 3 -> {
                    System.out.println(menu[2]);
                    if (inputNum.isBlank()) {
                        System.out.println(noNum);
                        break;
                    }

                    System.out.println(
                            isPrime(inputNum) ? "Sí" : "No"
                    );
                }
                case 4 -> {
                    System.out.println(menu[3]);
                    if (inputNum.isBlank()) {
                        System.out.println(noNum);
                        break;
                    }

                    System.out.println(
                            squareNum(inputNum)
                    );
                }
                case 5 -> running = false;
                default -> System.out.println("Entrada no válida");
            }
        }
    }
}
