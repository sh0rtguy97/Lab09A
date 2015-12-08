// Lab09Ast.java
// This is the student, starting file of Lab 09A.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the re-defined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.

import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
    public void paint(Graphics g)
    {
        XmasTree myTree = new XmasTree();
        myTree.drawTrunk(g);
        myTree.drawLeaves(g);
        myTree.drawOrnaments(g);
        myTree.drawStar(g);
        myTree.drawPresents(g);
        
    }
}

class Tree
{
    // Do NOT alter this Tree class in any way!
    public void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,475,395,525,600);
    }
    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillCircle(g,500,300,100);
    }
}

class PineTree extends Tree
{
    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillPolygon(g,375,400,625,400,500,150);
        Expo.fillPolygon(g,400,300,600,300,500,150);
        Expo.fillPolygon(g,450,200,550,200,500,150);
    }
}

class XmasTree extends PineTree
{
    public void drawOrnaments(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillCircle(g,500,200,12); // This is each ornament drawn
        Expo.fillCircle(g,525,250,12);
        Expo.fillCircle(g,460,270,12);
        Expo.fillCircle(g,500,300,12);
        Expo.fillCircle(g,560,320,12);
        Expo.fillCircle(g,435,350,12);
        Expo.fillCircle(g,590,380,12);
        Expo.fillCircle(g,490,370,12);
        Expo.fillCircle(g,530,350,12);
    }
    public void drawStar(Graphics g)
    {
        Expo.setColor(g,Expo.yellow);
        Expo.fillStar(g,500,130,40,5);
    }
    public void drawPresents(Graphics g)
    {
        Expo.setColor(g,Expo.blue);
        Expo.fillRectangle(g,350,500,450,600);
        Expo.setColor(g,Expo.red);
        Expo.fillRectangle(g,550,500,650,600);
        Expo.setColor(g,Expo.darkYellow);
        Expo.fillRectangle(g,390,600,410,500); //Ribbons for the blue box
        Expo.fillRectangle(g,350,540,450,560);
        Expo.fillRectangle(g,590,600,610,500); //Ribbons for the red box
        Expo.fillRectangle(g,550,540,650,560);
    }
}

