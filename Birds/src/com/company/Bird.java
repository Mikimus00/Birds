package com.company;

import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Bird {

    public static int num = 0;
    public Bird() {
        System.out.println("Я птица");
        num++;
    }

    public void Fly() {
        System.out.println("Я могу летать");
    }
    public String vid;
    protected Calendar c1 = new GregorianCalendar();
    protected Date date = new Date();
    SimpleDateFormat format1;
    protected int tp = 0;
    protected int a = -300;
    protected int b = 400;
    protected int x = a + (int)(Math.random()*b);
    protected int y = a + (int)(Math.random()*b);
    protected int size = 70;
    protected Color color = Color.BLUE;
    protected static int  xmin = 1000;
    protected static int xmax = -1000;
    protected static int ymin = 1000;
    protected static int ymax = -1000;
    public void Numb()
    {
        System.out.println(num);
    }

    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x,y,size,size);

    }


    public void sort()
    {
        int t = x;
        int t1 = y;
        if(t <= xmin) {xmin = t;}
        else {xmax = t + size;}
        if(t1 <= ymin) {ymin = t1;}
        else {ymax = t1 + size;}
    }
    public void draw1(Graphics g)
    {
        g.setColor(color);
        g.drawRect(xmin,ymin, xmax-xmin, ymax-ymin);
    }


    public void time(){
        format1 = new SimpleDateFormat(
                "HH:mm");
        System.out.println( format1.format(date));
       int hour = c1.get(Calendar.HOUR_OF_DAY);
       if(hour > 6 & hour <= 10){System.out.println("Утро");}
       else if(hour > 10 & hour <= 16) {System.out.println("День");}
       else if(hour > 16 & hour <= 23) {System.out.println("Вечер");}
       else if(hour > 0 & hour <= 6) {System.out.println("Ночь");}
    }

}
