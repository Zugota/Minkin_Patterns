package Proxy;

import java.util.HashMap;
import java.util.Map;

public class DatabaseProxy implements IDatabase {

    private final DatabaseImpl database;
    private final Map<String, String> cache;

    public DatabaseProxy(DatabaseImpl database) {
        this.database = database;
        cache = new HashMap<>();
    }

    @Override
    public String connectToDB(String dbName, String url) {
        if (cache.containsKey(dbName)) {
            System.out.println("Читаем Базу данных из кэша");
            return cache.get(dbName);
        }
        else {
            String db = database.connectToDB(dbName, url);
            cache.put(dbName, db);
            return db;
        }
    }
}
