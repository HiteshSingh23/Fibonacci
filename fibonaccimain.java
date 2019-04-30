package fibonacci;

import java.util.Scanner;

public class fibonaccimain {

    public int getfact(int num) {
        int fact = 1;
        System.out.println();
        System.out.println("enter the number for the fatorial: ");

        if (num < 1)
            System.out.println("invalid input");

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }


        /*while (num > 1 && num < 16) {
            fact = fact * num;
            num = num - 1;

        }*/
        return fact;
    }

    public int[] getfibo(int num)
    {
        int prev = 0, curr = 1, next = 0;
        System.out.println();
        System.out.println("enter the number for fibonacci : ");


        int[] fibarr = new int[num];

        fibarr[0] = prev;
        fibarr[1] = curr;


        int index=2;

        while (index<num)
        {
            next=prev+curr;
            fibarr[index]=next;
            index++;

            prev=curr;
            curr=next;
        }
        System.out.println("fibonacci series are : ");


        return fibarr;
    }
}
