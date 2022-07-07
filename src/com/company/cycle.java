package com.company;

public class cycle {
    /*Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
используя циклы while/ do ... while, for. (Все три реализации)*/
    public static void main (String[] args)
    {
        int month=0,zp=0;
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
        for (month = 1; month <= 12; month++)
        {
            zp = zp + 1000;
            System.out.println("месяц = " + month + ", З/п = " + zp);
        }
    }
}