package com.company;

public class cycle {
    /*Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
используя циклы while/ do ... while, for. (Все три реализации)*/
    public static void main (String[] args)
    {
        int i,month=0,zp=0;
        System.out.println("Ex1.");
        while (month<12){
            zp=zp+1000;
            month++;
            System.out.println("месяц = " + month + ", З/п = " + zp);
        }
        month=0; zp=0;
        System.out.println("Ex2.");
        do{
            zp=zp+1000;
            month++;
            System.out.println("месяц = " + month + ", З/п = " + zp);
        }while (month<12);
        zp=0;
        System.out.println("Ex3.");
        for (month = 1; month <= 12; month++){
            zp = zp + 1000;
            System.out.println("месяц = " + month + ", З/п = " + zp);
        }
        System.out.println("Выводим на экран «5,4,3,2,1» используя цикл for..");
        String str="";
        for (i = 5; i > 1; i--){
            System.out.print(i+",");
        }
        System.out.println(i);
    }
}