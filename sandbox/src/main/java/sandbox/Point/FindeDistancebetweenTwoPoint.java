package sandbox.Point;

/**
 * Created by Natasha on 24.05.2016.
 */
public class FindeDistancebetweenTwoPoint {
    public static void main(String[] args){
        Point1 p1 = new Point1(7,7);
        Point1 p2 = new Point1(4,4);

        System.out.println("Расстояние между двумя точками c  координатами " + "p1 = ("+p1.x1+","+ p1.y1 +")"+ "p2 = ("+p2.x1+","+ p2.y1+")"+" = " +p1.distance(p1, p2));

    }
}
