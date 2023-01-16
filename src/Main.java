import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний");
        }

        System.out.println("Задача 2");
        float outsideTemp = 4f;
        if (outsideTemp < 5) {
            System.out.printf(Locale.US, "На улице %.0f градусов - нужно надеть шапку", outsideTemp);
        } else {
            System.out.println("На улице " + outsideTemp + " градусов - можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.printf("Если скорость %d - то нужно заплатить штраф", speed);
        } else {
            System.out.printf("Если скорость %d - то нможно ехать", speed);
        }
    }
}