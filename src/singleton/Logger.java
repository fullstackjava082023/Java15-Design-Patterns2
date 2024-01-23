package singleton;

import javax.naming.NamingException;

public class Logger {

    String loggerName;

    //for singleton
    private static Logger instance;

    //for singleton
    private Logger(String loggerName) {
        this.loggerName = loggerName ;
    }


    public void logMessage(String message) {
        System.out.println(this.loggerName+ ":" + "Log " + message);
    }

    //for singleton
    public static Logger createObject(String loggerName) {
        if (instance == null) {
            instance = new Logger(loggerName);
        } else {
//            instance.loggerName = loggerName;
        }
        return instance;
    }





}
