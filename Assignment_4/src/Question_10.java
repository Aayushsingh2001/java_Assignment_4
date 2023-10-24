/* Write a program to check whether given number is divisible by 5 or 7 */
public class Question_10 {
    public static void main(String[] args) {
        int x = 345;
        if (x%5==0 || x%7==0)
            System.out.println(x+ " is divisible by 5 or 7");
        else
            System.out.println("Not divisible by both 5 and 7");
    }
}
