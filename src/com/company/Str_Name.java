package com.company;
// 2. Объявить строку с вашим полным именем и вывести на экран результат работы всех стандартных методов работы со строками
public class Str_Name {
    public static void main(String[] args) {
        String MyName = "Марина", surName = "Валериановна", name;
        char [] ShortName = new char [4];

        System.out.println(MyName.length());
        System.out.println(MyName.isEmpty());
        System.out.println(MyName.charAt(4));
        MyName.getChars(0,4,ShortName,0);
        System.out.println(ShortName);
        System.out.println(MyName.replace('р','ш'));
        System.out.println(MyName.replaceFirst("а", "А"));
        System.out.println(MyName.replaceAll("а", "А"));
        System.out.println(MyName.concat(" "+surName.toUpperCase()));
        if (MyName.startsWith("М") && MyName.endsWith("а")) {
            name=MyName.substring(1)+" родионовна";
            System.out.println(name.toUpperCase());
        }
    }
}
