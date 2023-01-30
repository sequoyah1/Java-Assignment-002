/**
 *
 * @author Trevor Hartman
 * @author Sequoyah Schaefer
 *
 * @since Version 1.0
 *
 */


import java.util.Scanner;
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please type the number of sides.");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n < 1) {
                break;
            }


            System.out.println(n);
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = n * s;
            double pi = p / 2;
            System.out.printf("Our PI estimate is: %.10f%n", pi);
        }
    }
}
