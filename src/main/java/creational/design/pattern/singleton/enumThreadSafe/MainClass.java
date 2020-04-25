package creational.design.pattern.singleton.enumThreadSafe;

import creational.design.pattern.singleton.enumThreadSafe.Database;
import creational.design.pattern.singleton.enumThreadSafe.DatabaseInstance;

public class MainClass {
    public static void main(String[] args) {
       DatabaseInstance.INSTANCE.setDatabase(new Database());
        DatabaseInstance.INSTANCE.getDatabase().executeQuery();
    }
}
