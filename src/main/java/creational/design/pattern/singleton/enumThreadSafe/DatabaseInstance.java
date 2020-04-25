package creational.design.pattern.singleton.enumThreadSafe;

import creational.design.pattern.singleton.enumThreadSafe.Database;

public enum DatabaseInstance {
    INSTANCE;

    public Database getDatabase() {
        return this.database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    private Database database;


}
