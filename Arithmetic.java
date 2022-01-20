/**
 * @author    Glen McIntosh, S02044306
 * @version   2022/01/18, CSC-240 Arithmetic
 */


import java.util.Scanner;
//import scanner

public class Arithmetic {

    /**
     * Main entry point.
     * <p>
     * Execute:</p>
     * <pre>java Arithmetic</pre>
     *
     * @param args           not used
     */

    public static void main(String[] args) {

//        int a = 3;
//        int b = 2;
//        //for testing
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //get values for each variable
        System.out.println("Enter Value A");
        int a = scanner.nextInt();

        System.out.println("Enter Value B");
        int b = scanner.nextInt();

        System.out.println("1. " + ((3 * a) + (2 * b)) / 2);
        //make sure parenthesis are correct to avoid ooo mistakes
        System.out.println("2. " + (a * b) / (a + b));
        System.out.println("3. " + 4*(a-b));
        System.out.println("4. " +(a-b)/(a+b));
        //(base, power)
        System.out.println("5. " + Math.pow(a, -b));

        
    }

}
