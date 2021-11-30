package eugene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Liczba a ");
        int a=sc.nextInt();
        System.out.print("Liczba b ");
        int b=sc.nextInt();
        System.out.print("Modulo n ");
        int n=sc.nextInt();
        if (a%n==b%n)
            System.out.print("Liczby "+a+" i "+b+" przystają do siebie modulo "+n);
        else
            System.out.print("Liczby "+a+" i "+b+" nie przystają do siebie modulo "+n);

    }
}
