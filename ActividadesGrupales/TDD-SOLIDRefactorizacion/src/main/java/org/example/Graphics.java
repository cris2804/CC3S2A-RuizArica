package org.example;

public class Graphics {


    public void drawHorizontalLine(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawString(String text) {
        System.out.println(text);
    }
}
