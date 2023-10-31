public class Main {
    public static void main(String[] args) {
        task6();
    }
    public static void task1(){
        int age = 18;

        if(age >= 18) System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        else System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
    }

    public static void task2(){
        int temperature = 12;

        if(temperature < 5) System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        else System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
    }

    public static void task3(){
        int speed = 50;

        if(speed > 60) System.out.println("Если скорость " + speed + "километров, то придется заплатить штраф");
        else System.out.println("Если скорость " + speed + " километров, то можно ездить спокойно");
    }

    public static void task4(){
        int age = 100;

        if(age >= 2 && age <= 6) System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в детский сад");
        else if(age >= 7 && age <= 17){
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в школу");
        }
        else if(age >= 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в университет");
        }
        else System.out.println("Если возраст человека равен " + age +", то ему нужно ходить на работу");
    }

    public static void task5(){
        int age = 14    ;
        if(age < 5) System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        else if(age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения");
    }

    public static void task6(){
        int numberOfPassengers = 70;
        int numberOfPlace = 102;
        int numberOfSeats = 60;
        int numberOfStandingPlaces = numberOfPlace - numberOfSeats;

        if(numberOfPassengers < numberOfPlace ){

            if(numberOfPassengers >= 60) {
                int numberOfStandingPlacesRightNow = numberOfStandingPlaces - (numberOfPassengers - numberOfSeats);
                System.out.println("Есть стоячие места, их количество равно " + numberOfStandingPlacesRightNow);
            }
            else {
                int numberOfSeatsRightNow = numberOfSeats - numberOfPassengers;
                System.out.println("Есть сидячие места, их количество равно " + numberOfSeatsRightNow);
            }
        }
        else System.out.println("Мест нет");
    }

    public static void task7(){
        int one = 10;
        int two = 5;
        int three = 3;
        int max;

        if(one > two) max = one;
        else if(two > three) max = two;
        else max = three;

        System.out.println(max);
    }
}