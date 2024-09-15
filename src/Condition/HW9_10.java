package Condition;

import java.util.Random;
import java.util.Scanner;

public class HW9_10 {
    public static void main(String[] args) {
        System.out.println("Проверьте микроволновку");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean isMicrowaveGood = random.nextBoolean();
        boolean isCard = random.nextBoolean();
        System.out.println("Микроволновка подходит? - " + isMicrowaveGood);
        if (isMicrowaveGood) {
            System.out.println("Пройдите к кассе");
            if (isCard) {
                System.out.print("Способ оплаты: карта" + "\nВведите пин-код: ");
                int pin = sc.nextInt();
                System.out.println("Заберите микроволновку");
            } else {
                System.out.println("Способ оплаты: наличка" + "\nЗаберите микроволновку");
            }
        } else {
            System.out.println("Выберите другую микроволновку");
        }
    }
}