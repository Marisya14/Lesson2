package com.company;

public class Str_Name {
    public static void main(String[] args) {
        String MyName = "Марина";
        char [] ShortName = new char [4];

        System.out.println(MyName.length());
        System.out.println(MyName.isEmpty());
        System.out.println(MyName.charAt(4));
        MyName.getChars(0,4,ShortName,0);
        System.out.println(ShortName);
    }
}
