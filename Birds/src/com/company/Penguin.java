package com.company;

import java.awt.*;
import javax.swing.*;


public class Penguin extends Bird {
    public Penguin()
    {
        System.out.println("Я пингвин");
        vid = "Пингвин";
        num++;
        tp = 2;
        this.time();
        this.color = new Color(0,255,0);
        this.size = 20;
        this.xmin = x + size/2;
        this.ymin = y + size/2;
    }
    @Override
    public void Fly()
    {
        System.out.println("Я не могу летать");
    }
    @Override
    public void sort()
    {
        int t = x;
        int t1 = y;
        if(t <= xmin) {xmin = t;}
        else {xmax = t + size;}
        if(t1 <= ymin) {ymin = t1;}
        else {ymax = t1 + size;}
    }
    @Override
    public void draw(Graphics g){
        g.setColor(new Color(0,255,0));
        this.size = 70;
        g.fillOval(this.x,this.y,this.size,this.size);
        g.setColor(new Color(255,0,0));
        g.fillOval(this.x+5,this.y+5,this.size / 2,this.size / 2);
    }
    @Override
    public void draw1(Graphics g)
    {
        g.setColor(color);
        g.drawRect(xmin,ymin, xmax-xmin, ymax-ymin);
    }
}
