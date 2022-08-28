package behavioral.commanda;

public class Commanda {
    public static void main(String[] args) {
        Runnable command = () -> {
            System.out.println("Command action");
        };
        Thread th = new Thread(command);
        th.start();
    }
}
