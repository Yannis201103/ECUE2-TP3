package net.lecnam.ecue2.tp3;


public class Exec  {
    public static void main(String[] args) {
        Exercice1.Point point = new Exercice1.Point(6,7);

        point.translate(1,1);
        System.out.println(point.pointLatitude);
        System.out.println(point.pointLongitude);

        Exercice1.Point p = new Exercice1.Point(2,4);

        System.out.println(point.equals(p));

        System.out.println(point.toString());

        System.out.println(point.retourneDistance(p));

        Exercice2.Rectangle rectangle = new Exercice2.Rectangle(p,1,2);

        Exercice2.Rectangle rectangle2 = new Exercice2.Rectangle(2,2,3,4);
        Exercice2.Rectangle rectangle3 = new Exercice2.Rectangle(2,2,3,4);

        System.out.println(rectangle2.contient(p));

        System.out.println(rectangle2.equals(rectangle3));

        System.out.println(rectangle2.toString());

        Dessin.ajout(rectangle);
    }

}
