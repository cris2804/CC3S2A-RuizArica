package org.example;
import org.example.TextBoxes;
import org.example.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Shapes {
    public final List<Shape> allShapes = new ArrayList<>();
    public static void main(String[] args){
        System.out.println("aplicando el principio de responsabilidad unica SRP");
        Shapes shapes = new Shapes();
        shapes.add(new TextBoxes("Hola"));
        shapes.add(new Rectangle(5, 5));
        shapes.draw(new Graphics());
    }
    public void add(Shape s){
        allShapes.add(s);
    }
    public void draw(Graphics g) {
        for (Shape s : allShapes) {
            switch (s.getType()) {
                case "textbox":
                    var t = (TextBoxes) s;
                    t.draw(g);
                    break;

                case "rectangle":
                    var r = (Rectangle) s;
                    r.draw(g);
            }
        }
    }
}
