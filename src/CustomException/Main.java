package CustomException;

import java.awt.*;

 class line {
    private Point begin;
    private Point end;
    public line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }
    public line(Point o1,Point o2)
    {
       this.begin=o1;
       this.end=o2;
    }
    public String toString() {
        return "Line (" + begin + ", " + end + ")";
    }
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }
}
public class Main {
    public static void main(String[] args) {
        line ans=new line(2,8,6,7);
        System.out.println(ans.getLength());
        System.out.println("jiii");

    }
}
