package workWithObjects;

import org.testng.annotations.Test;

public class Person {

    @Test
    public void doit(){
//        System.out.println("Hello, my name is " + name + ". My age is " + age + ". And my speciality is " + speciality);
//        System.out.println();

        Engineer engineerProgrammer = new Engineer("Jacky", 18);
        System.out.println(engineerProgrammer.engeneerNeme + ":" + engineerProgrammer.age);

        Engineer engineerQA = new Engineer("Amanda", 30);
        System.out.println(engineerQA.engeneerNeme + ":" + engineerQA.age);

        Engineer engineerSantechnic = new Engineer("Ihor", 55);
        System.out.println(engineerSantechnic.engeneerNeme + ":" + engineerSantechnic.age);

        Engineer defaultEngineer = new Engineer();

    }

    int age = 35;
    String name = "Vadym";
    String speciality = "Automation";
}
