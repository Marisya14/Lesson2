package com.company;

public class Types {
    public static void main(String[] args) {
        byte n1 = 100; // 8 бит
        short n2 = 200; // 16 бит
        int nn, n3 = 300; // 32 бит
        long n4 = 400; // 64 бит

        float nnn, n5 = 1.55f; // 32 бит
        double n6 = 3.50; // 64 бит

        char s1 = 'A'; // 16 бит
        boolean bl = true; // 8 бит, или false

        nn = (int) (n1+n2+n3+n4);
        System.out.println ("n1+n2+n3+n4 = "+ new String(String.valueOf(nn)));
        nnn = (float) (n6 + n5);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println("n5+n6 = "+ new String(String.valueOf(nnn)));
        //System.out.print("n5+n6 = ");
        //System.out.println(nnn);
        System.out.println(s1);
        System.out.println ("bl = "+ bl);
    }
}
