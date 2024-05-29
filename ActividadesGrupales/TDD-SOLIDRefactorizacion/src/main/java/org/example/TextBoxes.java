package org.example;

import java.awt.*;


public class TextBoxes extends Shape {

    private String text;

    public TextBoxes(String text) {
        this.text = text;
        this.type = "textbox";

    }


    public void draw(Graphics g) {
        g.drawString(text);
    }
}
