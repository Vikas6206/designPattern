package creational.design.pattern.singleton.normal;

public class SingletonClass {

    /**
     * This type of class are not thread safe. To make it thread safe we go for enum.
     * How to resolve this issue in this class
     */
    private SingletonClass(){

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return SingletonClass.instance;
    }
}
