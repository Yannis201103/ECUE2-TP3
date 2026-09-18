package net.lecnam.ecue2.tp3;

public class Exec {
    public static void main(String[] args) {

        Dessin dessin = new Dessin();

        Exercice2.Rectangle rectangle1 =
                new Exercice2.Rectangle(2, 2, 3, 4);

        Exercice2.Rectangle rectangle2 =
                new Exercice2.Rectangle(5, 5, 6, 7);

        dessin.ajout(rectangle1);
        dessin.ajout(rectangle2);

        System.out.println("Surface totale : " + dessin.retourneSurface());

        System.out.println("Plus grand rectangle :");
        System.out.println(dessin.retournePlusGrandRectangle());

        dessin.translate(10, 10);

        System.out.println("Après déplacement :");
        System.out.println(dessin.retournePlusGrandRectangle());

    }
}
