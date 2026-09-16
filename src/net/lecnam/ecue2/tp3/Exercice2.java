package net.lecnam.ecue2.tp3;

public class Exercice2 {
    public static class Rectangle {

        double longueur1;
        double longueur2;
        double x;
        double y;

        public Rectangle(Exercice1.Point Point, double longueur1, double longueur2) {
            this.x = Point.pointLongitude;
            this.y = Point.pointLatitude;
            this.longueur1 = longueur1;
            this.longueur2 = longueur2;
        }

        public Rectangle(double x, double y, double longueur1, double longueur2){
            this.x = x;
            this.y = y;
            this.longueur1 = longueur1;
            this.longueur2 = longueur2;
        }

        double Surface(){
            return this.longueur2 * this.longueur1;
        }

        void translate(double x, double y){
            this.x += x;
            this.y += y;
        }
    }
}
