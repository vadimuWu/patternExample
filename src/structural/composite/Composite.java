package structural.composite;

import java.awt.*;

public class Composite {
    public static void main(String[] arguments) {
        Container container = new Container();
        Component component = new java.awt.Component(){};
        System.out.println(component.getComponentOrientation().isLeftToRight());
        container.add(component);
        container.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        System.out.println(component.getComponentOrientation().isLeftToRight());
    }
}
