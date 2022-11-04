package Hcn;

import java.io.DataInput;

public class Hcn {
    public double Dai;
    public double Rong;
    public Hcn(double Dai,double Rong){
        this.Dai = Dai;
        this.Rong = Rong;
    }
    public void CalArea(){
        System.out.println("The area of the rectangle = "+(Dai*Rong));
    }
    public void CalPerimeter(){
        System.out.println("The perimeter of the rectangle = "+(Dai+Rong)*2);
    }
}
