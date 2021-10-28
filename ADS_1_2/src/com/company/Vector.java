package com.company;

public class Vector {
    Dot A;
    Dot B;
    double AB;
    double angle;
    double PI = 3.142;
    Vector(){
        do{
            A = new Dot();
            B = new Dot();
        }
        while(A.x == B.x && A.y == B.y);
    }
 public double Polar_Coordinates(){
        double w = Math.pow((A.x-B.x),2) + Math.pow((A.y - B.y),2);
        AB = Math.sqrt(w);
        //angle = Math.atan2((A.x-B.x), (A.y-B.y));
        return AB;
    }
public double Angle(){
        double x = (A.x - B.x);
        double v = (A.y - B.y);
        angle = Math.atan2(x,v);
        return angle;
}
public String toString(){
    return ("A("+ A.x + ","+ A.y+")," + "B("+ B.x + ","+B.y +")");
}

}
