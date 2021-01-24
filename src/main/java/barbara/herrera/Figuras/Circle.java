/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbara.herrera.Figuras;

import java.awt.*;

/**
 * @author Barbara Herrera
 */
public class Circle extends Shape {
    public final static double DEFAULT_RADIOUS = 10;
    private double radious;
    private static int counter;

//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">

    /**
     * @param radious
     * @param origin
     */
    public Circle(double radious, Point origin) {
        super(origin);
        this.radious = radious;
        counter++;
    }

    public Circle(double radious, Point origin, Color actualColor) {
        super(actualColor, origin);
        this.radious = radious;
        counter++;
    }

    public Circle() {
        this(DEFAULT_RADIOUS, DEFAULT_POINT);
//        super();
//        radious = DEFAULT_RADIOUS;
    }

    @Override
    public int getCodi() {
        return 0;
    }

    public static int getCounter() {
        return counter;
    }

//</editor-fold>

// <editor-fold defaultstate="collapsed" desc=" Getters && setters ">


    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double perimeter() {
        return 2 * radious;
    }

    /**
     * @return DOUBLE AREA
     */
    @Override
    public double area() {
        return Math.PI * radious * radious;
    }

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + '}' + " " + super.toString();
    }


    @Override
    public double perimetro() {
        return 0;
    }

    // </editor-fold>

}




