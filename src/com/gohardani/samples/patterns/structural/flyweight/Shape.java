package com.gohardani.samples.patterns.structural.flyweight;

import java.awt.*;

public interface Shape {

    public void draw(Graphics g, int x, int y, int width, int height,
                     Color color);
}