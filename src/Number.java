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

    static boolean isPrime(int n){
        if (n <= 1)
            return false;
        else if (n < 4 & n > 1)
            return true; // 2 and 3 are primes
        else if (n%2 == 0 | n%3 == 0)
            return false; // their multiples aren't
        else if (n < 24)
            return true; // 25 is the first 6k+1 prime

        int i = 5;
        while (square(i+=6) <= n)
        {
            /* if n is divisible by 6k-1 or 6k+1
               then it isn't a prime number */
            if (n%i == 0 | n%(i+2) == 0)
                return false;
        }

        return true;
    }

    static long square(int n){
        return n*n;
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
                            isPrime(Integer.parseInt(inputNum)) ? "Sí" : "No"
                    );
                }
                case 4 -> {
                    System.out.println(menu[3]);
                    if (inputNum.isBlank()) {
                        System.out.println(noNum);
                        break;
                    }

                    System.out.println(
                            square(Integer.parseInt(inputNum))
                    );
                }
                case 5 -> running = false;
                default -> System.out.println("Entrada no válida");
            }
        }
    }
}
