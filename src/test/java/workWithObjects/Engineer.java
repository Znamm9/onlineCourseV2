package workWithObjects;

public class Engineer extends Human{

    public Engineer(String n, int a){
        age = a;
        engeneerNeme = n;
    }

    public Engineer(){

    }

    String speciality = "Engineer";

    public void printName(){
        System.out.println("Name of this guy is " + engeneerNeme);
    }
}
