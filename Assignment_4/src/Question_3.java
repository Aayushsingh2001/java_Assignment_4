import java.awt.*;

/* Write a program to check whether a given number is even or odd without modulo operator. */
public class Question_3 {
    public static void main(String[]args) {
        int x = 4552;
        if (x / 2 * 2 == x)   // (x&1)==0 another logic to find the Even or Odd number.
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
