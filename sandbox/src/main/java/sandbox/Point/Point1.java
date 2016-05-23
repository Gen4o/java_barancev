package sandbox.Point;

/**
 * Created by Natasha on 24.05.2016.
 */
public class Point1 {
    public double x1;
    public double y1;
    public  double d;

    public Point1(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public double distance(Point1 p1, Point1 p2){
        return this.d = Math.sqrt(Math.pow((p2.x1-p1.x1),2)+Math.pow((p2.y1-p1.y1),2));
    }
}
