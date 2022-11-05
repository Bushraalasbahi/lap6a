import java.util.Scanner;
/* Q8 :Prime numbers. Write a program that prompts the user for an integer and then
prints out all prime numbers up to that integer*/
public class B5 {
    public static void main(String[] args) {

        System.out.println("enter num....");
        Scanner in=new Scanner(System.in);
        int th=in.nextInt();
        for (int i = 1; i < th; i++) {
            int o=0;
            for (int j = 1; j < i; j++) {
            if (th%j==0)o++;
            if (o==2)
            {
                System.out.println(i);
            }}
        }
    }
}
