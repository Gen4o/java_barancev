package sandbox.Point;

/**
 * Created by Natasha on 24.05.2016.
 */
public class FindeDistancebetweenTwoPoint {
    public static void main(String[] args){
        Point p1 = new Point(3,3);
        Point p2 = new Point(2,1);
        Point p3 = new Point(7,7);
        Point p4 = new Point(6,6);

        System.out.println("Расстояние между двумя точками c  координатами " + "p1 = ("+p1.x1+","+ p1.y1 +")"+ " и p2 = ("+p2.x1+","+ p2.y1+")"+" = " +p1.distance(p1, p2));
        System.out.println("Расстояние между двумя точками c  координатами " + "p3 = ("+p3.x1+","+ p3.y1 +")"+ " и p4 = ("+p4.x1+","+ p4.y1+")"+" = " +p1.distance(p3, p4));

    }
}
