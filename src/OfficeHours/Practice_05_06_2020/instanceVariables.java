package OfficeHours.Practice_05_06_2020;

public class instanceVariables {

    int a =100;// Instance variable : belongs to object

    public static void main(String[] args) {


        int a = 100; // local variable

        instanceVariables obj1 = new instanceVariables(); // object

        obj1.a=300;

        System.out.println(300);

        instanceVariables obj2 = new instanceVariables();

        System.out.println(obj2.a);


    }


}