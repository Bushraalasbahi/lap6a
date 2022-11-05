import java.util.Scanner;
/* Write programs with loops that compute
 The sum of all even numbers between 2 and 100 (inclusive).
 The sum of all odd numbers between a and b (inclusive), where a and b are
   inputs.
 The sum of all odd digits of an input. (For example, if the input is 32677,
    the sum would be 3 + 7 + 7 = 17.)*/
public class B2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {if (i % 2 == 0) System.out.println(i);}
        Scanner v=new Scanner(System.in);
        int ca=v.nextInt();
        int x=v.nextInt();
        for (int i = ca; i < x; i++)
        {if (i % 2 == 0) System.out.println(i);}
      /*c*/  Scanner in = new Scanner(System.in);
        int []arr= new int[5];
        for (int i = 0; i < arr.length; i++)

        {arr[i]=in.nextInt();}
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {if(arr[i]%2==1) sum=sum+arr[i];}
        System.out.println(sum);
    }
    }



