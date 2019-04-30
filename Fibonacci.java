package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        fibonaccimain fb = new fibonaccimain();
        int fact1 = fb.getfact(5);
        System.out.println(fact1);

        int[] fib1 = fb.getfibo(4);
        for (int i : fib1) {
            System.out.println(i);
        }

        /*
        int prev = 0;
        int curr = 1;
        int next = 0;
        int noe = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the valid input");
            noe = sc.nextInt();
        } while (noe < 2);

        int[] fibarr = new int[noe];
        fibarr[0] = prev;
        fibarr[1] = curr;

        int index = 2;


        while (index < noe) {

            next = prev + curr;
            fibarr[index] = next;
            index++;

            prev = curr;
            curr = next;

        }
        System.out.println("First" + noe + "elements of fibonacci series are");
        for (int i : fibarr) {
            System.out.printf("%d, ", i);
        }
//factorial-3=3*2*1
        int fact = 1;
        int num;

        Scanner we = new Scanner(System.in);
        num = we.nextInt();
        int input = num;
        if (num < 1)
            System.out.println("invalid input");

        while (num > 1 && num < 16) {
            fact = fact * num;
            num = num - 1;

        }
        System.out.println("factorial of " + input + "is " + fact);

//other way

for(int i=1;i<num;i++)
{
fact=fact*i;
}

  */
    }


}


