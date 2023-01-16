import javax.sound.midi.Soundbank;
import java.text.Format;
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
            System.out.printf(Locale.US, "На улице %.0f градусов - нужно надеть шапку \n", outsideTemp);
        } else {
            System.out.println("На улице " + outsideTemp + " градусов - можно идти без шапки \n");
        }

        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.printf("Если скорость %d - то нужно заплатить штраф \n", speed);
        } else {
            System.out.printf("Если скорость %d - то нможно ехать \n", speed);
        }

        System.out.println("Задача 4");
        int age2 = 40;
        if (2 <= age2 && age2 <= 6) {
            System.out.printf("Если возраст человека равен %d то ему нужно ходить в детский сад\n", age2);
        }
        if (7 <= age2 && age2 < 18) {
            System.out.printf("Если возраст человека равен %d то ему нужно ходить в школу\n", age2);
        }
        if (18 <= age2 && age2 < 24) {
            System.out.printf("Если возраст человека равен %d то ему нужно ходить в университет\n", age2);
        }
        if (24 <= age2) {
            System.out.printf("Если возраст человека равен %d то ему нужно ходить на работу\n", age2);
        }

        System.out.println("Задача 5");
        int ageKid = 26;
        String strCantAttr = String.format("Если возраст ребенка равен %d, то ему нельзя кататься", ageKid);
        String strCantWithAdult = String.format("Если возраст ребенка равен %d, то ему можно кататься в сопровождении взрослого", ageKid);
        String strCantWithoutAdult = String.format("Если возраст ребенка равен %d, то ему можно кататься без сопровождении взрослого", ageKid);
        if (5 > ageKid) {
            System.out.println(strCantAttr);
        }
        if (5 <= ageKid && ageKid <= 14) {
            System.out.println(strCantWithAdult);
        }
        if (14 < ageKid) {
            System.out.println(strCantWithoutAdult);
        }

        System.out.println("Задача 6");
        int passCount = 103;
        int allSeats = 102;
        int sitCount = 60;
        String noSeats = String.format("Нет мест");
        String avSitSeats = String.format("Есть сидячие места");
        String avStaySeats = String.format("Есть стоячие места");
        if (passCount > allSeats) {
            System.out.println(noSeats);
        }
        if (passCount < sitCount) {
            System.out.println(avSitSeats);
        }
        if (sitCount <= passCount && passCount <= allSeats) {
            System.out.println(avStaySeats);
        }

        System.out.println("Задача 7");
        int one = 5;
        int two = 8;
        int three = 3;
        String firstNum = String.format("Большее число %d", one);
        String secondNum = String.format("Большее число %d", two);
        String thirdNum = String.format("Большее число %d", three);
        if (one > two && one > three) {
            System.out.println(firstNum);
        }
        if (one < two && three < two) {
            System.out.println(secondNum);
        }
        if (one < three && three > two) {
            System.out.println(secondNum);
        }


    }
}