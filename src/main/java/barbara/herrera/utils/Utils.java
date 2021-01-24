/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbara.herrera.utils;

import java.awt.*;
import java.util.Random;

/**
 * @author Barbara Herrera
 */
public class Utils {
    private static final Random r = new Random();

    /**
     * @param maxInt
     * @return valor a l'atzat de 0 a maxInt.
     */
    public static int atzarInt(int maxInt) {
        return r.nextInt(maxInt);
    }

    /**
     * @param max
     * @param min
     * @return Un valor aleatorio entre el maximo y el minimo
     */
    public static int random(int max, int min) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * Sirve para generar una velocidad inicial aleatoria
     *
     * @return velocidad -1 o 1
     */
    public static int getRandomSigno() {
        Random rand = new Random();
        if (rand.nextBoolean())
            return -1;
        else
            return 1;
    }


    /**
     * @param p1
     * @param p2
     * @return Retorna un punto medio
     */
    public static double distanciaEntreIndividuos(Point p1, Point p2) {
        return Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    }


}
