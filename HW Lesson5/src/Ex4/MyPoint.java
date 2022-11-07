package Ex4;

import java.util.Scanner;

public class MyPoint {
    public double x;
    public double y;
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }
    public MyPoint(MyPoint p){
        p.x = this.x;
        p.y = this.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(MyPoint secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2)+Math.pow(this.y - secondPoint.y, 2));
    }
    public double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2)+Math.pow(p1.y - p2.y, 2));
    }

    public MyPoint[] input(){
        System.out.print("Number of points to create (except MyPoint) = ");
        int numb = new Scanner(System.in).nextInt();
        MyPoint[] points = new MyPoint[numb+1];
        points[numb].x = this.x;
        points[numb].y = this.y;
        for (int i = 0; i < numb; i++) {
            System.out.print("x"+i+" = ");
            points[i].x = new Scanner(System.in).nextDouble();
            System.out.print("y"+i+" = ");
            points[i].y = new Scanner(System.in).nextDouble();
        }
        return points;
    }
    public void findTwoFurthestPoints(MyPoint[] points){
        double max = this.distance(points[0],points[1]);
        int p1MaxIndex = 0, p2MaxIndex = 1;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                if (max < this.distance(points[i],points[j])){
                    max = this.distance(points[i],points[j]);
                    p1MaxIndex = i;
                    p2MaxIndex = j;
                }
            }
        }
        System.out.println("The coordinate of 2 furthest point are A("+points[p1MaxIndex].x+","+points[p1MaxIndex].y+") & B("+points[p2MaxIndex].x+","+points[p2MaxIndex].y+")");
    }
}
