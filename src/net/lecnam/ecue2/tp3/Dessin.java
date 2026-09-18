package net.lecnam.ecue2.tp3;

public class Dessin {

    private static Exercice2.Rectangle[] rectangles;
    private static int nombreRectangles;

    public Dessin() {
        rectangles = new Exercice2.Rectangle[10];
        nombreRectangles = 0;
    }

    public static void ajout(Exercice2.Rectangle rectangle) {
        if (nombreRectangles < 10) {
            rectangles[nombreRectangles] = rectangle;
            nombreRectangles++;
        }
    }
}
