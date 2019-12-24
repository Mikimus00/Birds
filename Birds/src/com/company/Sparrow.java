package com.company;
import java.awt.*;
import javax.swing.*;

public class Sparrow extends Bird{
    public Sparrow()
    {
        System.out.println("Я воробей");
        vid = "Воробей";
        num++;
        tp = 3;
        this.time();
        this.color = new Color(250,125,65);
        this.size = 70;
        this.xmin = x + size/2;
        this.ymin = x + size/2;

    }
    @Override
    public void sort()
    {
        int t = x;
        int t1 = y;
        if(t <= xmin) {xmin = t;}
        else {xmax = t;}
        if(t1 <= ymin) {ymin = t1;}
        else {ymax = t1;}
    }
    @Override
    public void draw1(Graphics g)
    {
        g.setColor(color);
        g.drawRect(xmin,ymin, xmax-xmin, ymax-ymin);
    }
}
