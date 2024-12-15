package day6;

public class classDemo {
    public static void main(String[] args) {
        Car c1= new Car();




        System.out.println(c1.color);
        System.out.println(c1.year);
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.bool);

    }
    static class Car{
        String color;
        double year;
       int model;
       char name;
       float age;
       boolean bool;

            }
}
