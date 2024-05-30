package Singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoggerClass {

    private static LoggerClass loggerClass;

    private LoggerClass() {

    }

    public static synchronized LoggerClass getInstance() {
        if (loggerClass == null) {
            loggerClass = new LoggerClass();
        }
        return loggerClass;
    }

    public void classLog(Object obj, String info) {

        String className = obj != null ? obj.getClass().getSimpleName() : "NullObject";
        String currDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));
        System.out.println("Log info: " + currDate + " - " + className + " - " + info);

    }
}
