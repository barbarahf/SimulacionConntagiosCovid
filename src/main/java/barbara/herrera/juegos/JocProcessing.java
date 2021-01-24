/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbara.herrera.juegos;

import barbara.herrera.interficies.JocInterface;
import processing.core.PApplet;


/**
 * @author pereg
 */
public abstract class JocProcessing extends PApplet implements JocInterface {

    /**
     * Com volem que sigui el papplet (abans de dibuixar la finestra) i
     * preparar
     */
    @Override
    //Es como hacer una llamada a super, pero, ¿por qué sin super?
    public void settings() {
        prepararJoc();

    }

    /**
     * Quà volem posar al papplet (un cop ja tenim definida la finestra)
     * Si no hi ha el mètode draw, és el que mostra sempre
     */
    @Override
    public void setup() {
        iniciarJoc();
    }

    /**
     * Es va refrescant framerate vegades per segon (fps)
     * Per defecte són 10 fps
     * Permet fer el moviment
     */
    @Override
    public void draw() {
        jugada();
        if (esFinal()) {
            finalJoc();

            noLoop(); //deixa de cridar el draw
        }
    }

}
