/**
 * @author    Glen McIntosh, S02044306
 * @version   2022/01/18, CSC-240 SmallLarge
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SmallLarge {


    /**
     * Main entry point.
     * <p>
     * Execute:</p>
     * <pre>java SmallLarge</pre>
     *
     * @param args           not used
     */

    public static void main(String[] args) {

      // I want to use the least amount of comparison operators (how about 0)
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = scan.nextInt();


        System.out.println("Enter second number");
        int n2 = scan.nextInt();


        System.out.println("Enter third number");
        int n3 = scan.nextInt();


        Integer[] list = {n1,n2,n3};

        int smallest = Collections.min(Arrays.asList(list));

        int largest = Collections.max(Arrays.asList(list));

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

    }
}
