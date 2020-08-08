package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canGoOutside(generateRandomAge(), 37));
        System.out.println(canGoOutside(generateRandomAge(), 30));
        System.out.println(canGoOutside(generateRandomAge(), 29));
        System.out.println(canGoOutside(generateRandomAge(), -10));
        System.out.println(canGoOutside(generateRandomAge(), 7));
    }


    public static String canGoOutside(int age, int temperature) {

        if (age >= 25 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        }
        if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        }
        if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random r = new Random();
        int age = r.nextInt(100);
        return age;
    }
}
