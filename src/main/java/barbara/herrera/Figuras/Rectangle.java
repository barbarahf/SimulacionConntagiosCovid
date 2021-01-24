package barbara.herrera.Figuras;

import java.awt.*;

public class Rectangle extends Shape {
    private double height;
    private double width;
    public static final double DEFAULT_HEIGHT = 40;
    public static final double DEFAULT_WIDTH = 40;
    private static int counter;
    private final int codi;


    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Rectangle() {

        this(DEFAULT_POINT, DEFAULT_HEIGHT, DEFAULT_WIDTH);

    }

    public Rectangle(Point origin, double height, double width) {
        super(origin);
        this.height = height;
        this.width = width;
        counter++;
        codi = 20000 + counter;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHW(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public int getCodi() {
        return codi;
    }


//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="METHODS">
    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimetro() {
        return 2 * (this.width + this.height);
    }
    //</editor-fold>

}
