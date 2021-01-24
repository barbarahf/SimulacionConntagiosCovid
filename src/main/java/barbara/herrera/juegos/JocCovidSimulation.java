package barbara.herrera.juegos;

import barbara.herrera.Figuras.Individuo;
import barbara.herrera.utils.Utils;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Barbara Herrera FLores
 */

public class JocCovidSimulation extends JocProcessing {

    private final ArrayList<Individuo> personas = new ArrayList<Individuo>();
    private static final int RIDIO = 6;
    private static final int PERIMETRO = RIDIO * 2;

    /**
     * @param pointToCheck Recibe un punto aleatorio para verificar si está o no ocupado.
     * @param radius       el radio del individuo a comparar
     * @return Boolean, true si el punto está cupado
     */

    public boolean checkOccupedPoint(Point pointToCheck, double radius) {
        for (Individuo persona : personas) {
            double distance = Utils.distanciaEntreIndividuos(pointToCheck, persona.getOrigin());
            if (distance < radius + persona.getRadious()) {
                return true;
            }
        }
        return false;
    }

    /**
     * En la funcion preparar joc se inicia el número de "individuos" y un punto aleatorio (para cada individuo)
     * separado del borde la la pantalla, así preparar el estado inicial del juego.
     */
    @Override
    public void prepararJoc() {

        setSize(1300, 700);
        /*Se crea un boton para reiniciar el juego*/
        while (personas.size() < 200) {
            Point randomPoint = new Point((int) random(PERIMETRO, this.width - PERIMETRO), (int) random(PERIMETRO, this.height - PERIMETRO));
            while (checkOccupedPoint(randomPoint, RIDIO)) {
                randomPoint = new Point((int) random(PERIMETRO, this.width - PERIMETRO), (int) random(RIDIO, this.height - PERIMETRO));
            }
            Individuo nuevaPersona = new Individuo(RIDIO, randomPoint, new Color(170, 198, 202));
            personas.add(nuevaPersona);
        }

        int randomInfected = Utils.random(0, personas.size());
        personas.get(randomInfected).setInfectat(true);
    }

    @Override
    public void iniciarJoc() {
        background(0);
    }

    /**
     * Metodo jugada, es el que se encargar de toda la ejecucion del juego, dibujar, mover los objetos y actualizar
     */
    @Override
    public void jugada() {

        background(255, 255, 255);
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).dibuixa(this);
            personas.get(i).mou(this);
            personas.get(i).choqueDetectar(personas);

        }
        textSize(20);
        text("Infectados: " + Individuo.getInfectados(), 10, 30);
        fill(0, 102, 153);
        text("Curados: " + Individuo.getCurados(), 10, 60);
        fill(0, 102, 153, 51);
        text("Sanos: " + Individuo.getSanos(), 10, 90);


    }

    @Override
    public boolean esFinal() {
        //  return Individuo.getInfectados() == 0;
        return false;
    }

    @Override
    public void finalJoc() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        JocProcessing.runSketch(
                new String[]{"Covid simulation"},
                new JocCovidSimulation());
    }


}
