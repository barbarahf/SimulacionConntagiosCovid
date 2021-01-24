/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbara.herrera.Figuras;

import java.awt.Color;
import java.awt.Point;


/**
 * @author Barbara Herrera
 */
public abstract class Shape {


    final static Color DEFAULT_COLOR = Color.RED;
    final static Point DEFAULT_POINT = new Point(0, 0);
    private static int nShapes = 0;

    private Color color;
    private Point origin;
    protected int codi;

//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">

    /**
     * @param origin
     */
    protected Shape(Point origin) {
//        color = DEFAULT_COLOR;
//        this.origin = origin;
        this(DEFAULT_COLOR, origin);
    }

    protected Shape() {
//        color = DEFAULT_COLOR;
//        origin = DEFAULT_POINT;
        this(DEFAULT_COLOR, DEFAULT_POINT);
    }

    //Constructor principal
    //Centralitza el control d'errors
    protected Shape(Color col, Point org) {
        color = col;
        origin = org;
        assignarCodi();
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">

    /**
     * @return el color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }
//</editor-fold>


    public abstract int getCodi();

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", origin=" + origin + ", codi=" + codi + '}';
    }


    protected void assignarCodi() {
        nShapes++;
        codi = nShapes;
    }

    public abstract double perimetro();
}
