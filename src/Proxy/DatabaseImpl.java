package Proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DatabaseImpl implements IDatabase {


    @Override
    public String connectToDB(String dbName, String url) {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("./resources/databases.txt");
        if(inputStream == null){
            throw new NullPointerException("Файл не найден");
        }

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String db;

        try {
            while(((db = bufferedReader.readLine()) != null)){
                if(dbName.equals(db)){
                    System.out.println("Читаем Базу данных из файла");
                    return (db + "/" + url);
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        throw new NullPointerException("База данных не найдена");
    }
}
