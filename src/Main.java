//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        int age = 40;
        if (age > 18) {
            System.out.println("Тебе больше 18 лет");
        }

        age = 17;
        if (age > 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 1;
        if (temperature < 5) {
            System.out.println("Нужно надеть шапку");
        } else {
            System.out.println("Можно не надевать шапку");
        }

        temperature = 6;
        if (temperature > 5){
            System.out.println("Можно идти без шапки");
        } else {
            System.out.println("нужно надеть шапку");
        }

        System.out.println("Задача 3");
        int speed = 87;
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }

        speed = 50;
        if (speed < 60) {
            System.out.println("Можно ездить спокойно");
        } else {
            System.out.println("Придется заплатить штраф");
        }

        System.out.println("Задача 4");
        age = 15;
        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в деский сад");
        } else if (age >= 7 && age <=17 ) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }


        System.out.println("Задача 5");
        age = 10;
        if (age < 5) {
            System.out.println("Не может кататься на атракционе");
        } else if (age < 14 ){
            System.out.println("Он может кататься на атракционе, но со взрослым");
        } else if (age >= 14) {
            System.out.println("Может кататься без взрослого");
        }


        System.out.println("Задача 6");
        int carriageCapacity = 102;
        int seatPlace = 60;
        if (seatPlace <= 60 && carriageCapacity <= 102){
            System.out.println("В вагоне есть сидячее место");
        } else if (seatPlace ==60 && carriageCapacity < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("Вагон переполнен");
        }

        System.out.println("Задача 7");
        int one = 10;
        int two = 2;
        int three = 56;
        if (one > two && one > three) {
            System.out.println("Чило " + one + " большее");
        }
        else if (one < two && two > three){
            System.out.println("Чило " + two + " большее");
        }
        else if (one < three && two < three) {
           System.out.println("Чило " + three + " большее");
        }

    }
}