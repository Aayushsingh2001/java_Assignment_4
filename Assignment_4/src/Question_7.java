/* Write a program to print greater among three numbers. */
public class Question_7 {
    public static void main(String[]args){
        int a=29,b=54,c=35;
        if (a>b){
            if (a>c){
                System.out.println(a+" is greater than "+b+" and "+c);
            }
        }
        else if (b>a){
            if (b>c){
                System.out.println(b+" is greater than "+a+" and "+c);
            }
        }
        else if (c>a){
            if (c>b){
                System.out.println(c+" is greater than "+a+" and "+b);
            }
        }
    }
}
