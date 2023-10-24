/* Write a program to check whether a character is an alphabet, a digit or some other character. */
public class Question_8 {
    public static void main(String[]args){
        char x = 'a';
        if (x>= 'a'&&x <='z' || x>= 'A' && x <= 'Z')
        System.out.println("Alphabet");
        else if (x>='0' && x<= '9')
            System.out.println("Digit");
        else
            System.out.println("Special characters");
    }
}
