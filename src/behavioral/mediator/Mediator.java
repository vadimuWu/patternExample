package behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class Mediator {
    public static void main(String[] args) {
        Timer mediator = new Timer("Mediator");
        TimerTask command = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Command pattern");
                mediator.cancel();
            }
        };
        mediator.schedule(command, 1000);
    }
}
