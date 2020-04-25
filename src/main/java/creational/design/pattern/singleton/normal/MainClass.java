package creational.design.pattern.singleton.normal;

public class MainClass {


    public static void main(String args[]){
        SingletonClass instance=SingletonClass.getInstance();
        SingletonClass instance2=SingletonClass.getInstance();
        if(instance==instance2){
            System.out.print("Both the instance are equal i.e they are refering to same memory location and another object is not created");
        }
    }
}
