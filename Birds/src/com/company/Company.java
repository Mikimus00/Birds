package com.company;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private int count = 0;
    private ArrayList<Bird> birds;
    private String type;
    private boolean i = true;
    Scanner x = new Scanner(System.in);
    private String names[] = {"Петя","Гоша","Кеша"};

    public Company()
    {
        birds = new ArrayList<>();
        System.out.println("Кого вы хотите добавить? 1- попугая; 2- пингвина; 3- воробья");
        while (i == true)
        {
            System.out.println(type = x.nextLine());
//            type = x.nextLine();
            switch (type)
            {
                case "2":
                    birds.add(new Penguin());
                    count++;
                    break;
                case "1":
                    birds.add(new Macaw());
                    count++;
                    break;
                case "3":
                    birds.add(new Sparrow());
                    count++;
                    break;
                default:
                    i = false;
                    break;
            }
        }
    }
    public void Count()
    {
        System.out.println("Всего " + count + " птиц");
    }
    public void Fly(){
        for(int i = 0; i < birds.size(); i++)
        {
            int j = i + 1;
            System.out.println("Птица " + j + " взлетела");
//            if (type == "пингвина")
//            {
//                System.out.println("пингвин " + j + " не взлетел");
//            }
//            else { System.out.println("попугай " + j + " Взлетел");}

        }
    }
    public void Names()
    {
        int a = 0;
        int b = birds.size();

        for(int i = 0; i < birds.size(); i++)
        {
            int j = i+1;
            int random = a + (int) (Math.random() * b);
            System.out.println("Птицу "+ j +" зовут " + names[random]);
        }
    }
    public void draw(Graphics g)
    {
        for(int i = 0; i < birds.size(); i++)
        {
            if(birds.get(i).tp == 1)
            {
              birds.get(i).sort();
                birds.get(i).draw1(g);
            }
            if(birds.get(i).tp == 2)
            {
                birds.get(i).sort();
                birds.get(i).draw1(g);
            }
            if(birds.get(i).tp == 3)
            {
                birds.get(i).sort();
                birds.get(i).draw1(g);
            }
            birds.get(i).draw(g);
        }

//        if(birds.get(count).tp == 1)
//            {
//                for(int i = 0; i < birds.size(); i++)
//                {
//                    birds.get(i).sort();
//                    birds.get(i).draw(g);
//
//                }
//                birds.get(count).draw1(g);
//            }
//        if(birds.get(count).tp == 2)
//        {
//            for(int i = 0; i < birds.size(); i++)
//            {
//                birds.get(i).sort();
//                birds.get(i).draw(g);
//
//            }
//            birds.get(count).draw1(g);
//        }
//        if(birds.get(count).tp == 3)
//        {
//            for(int i = 0; i < birds.size(); i++)
//            {
//                birds.get(i).sort();
//                birds.get(i).draw(g);
//
//            }
//            birds.get(count).draw1(g);
//        }

    }
}
