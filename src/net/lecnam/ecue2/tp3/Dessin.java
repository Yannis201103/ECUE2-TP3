package net.lecnam.ecue2.tp3;

public class Dessin {

    private Exercice2.Rectangle[] rectangles;
    private int nombreRectangles;

    public Dessin() {
        rectangles = new Exercice2.Rectangle[10];
        nombreRectangles = 0;
    }

    public void ajout(Exercice2.Rectangle rectangle) {
        if (nombreRectangles < 10) {
            rectangles[nombreRectangles] = rectangle;
            nombreRectangles++;
        }
    }

    public double retourneSurface() {
        double surfaceTotale = 0;

        for (int i = 0; i < nombreRectangles; i++) {
            surfaceTotale += rectangles[i].Surface();
        }

        return surfaceTotale;
    }

    public void translate(double x, double y) {
        for (int i = 0; i < nombreRectangles; i++) {
            rectangles[i].translate(x, y);
        }
    }

    public Exercice2.Rectangle retournePlusGrandRectangle() {
        if (nombreRectangles == 0) {
            return null;
        }

        Exercice2.Rectangle plusGrand = rectangles[0];

        for (int i = 1; i < nombreRectangles; i++) {
            if (rectangles[i].Surface() > plusGrand.Surface()) {
                plusGrand = rectangles[i];
            }
        }

        return plusGrand;
    }
    // ICI
    @Override
    public String toString() {
        String resultat = "";

        for (int i = 0; i < nombreRectangles; i++) {
            resultat += rectangles[i] + "\n";
        }

        return resultat;
    }
}
