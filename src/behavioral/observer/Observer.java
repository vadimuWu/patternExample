package behavioral.observer;

import java.util.Observable;

public class Observer {
    public static void main(String[] args) {
        Observer observer = (obj, arg) -> {
            System.out.println("Arg: " + arg);
        };
        Observable target = new Observable(){
            @Override
            public void notifyObservers(Object arg) {
                setChanged();
                super.notifyObservers(arg);
            }
        };
        target.addObserver((java.util.Observer) observer);
        target.notifyObservers("Hello, World!");
    }
}
