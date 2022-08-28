package behavioral.chainOfResponsibility;

import com.sun.tools.javac.Main;

import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler(){
            @Override
            public void publish(LogRecord record) {
                System.out.println("LogRecord обработан");
            }
        };
        logger.addHandler(consoleHandler);
        logger.info("test");
    }
}
