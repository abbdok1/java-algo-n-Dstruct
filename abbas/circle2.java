package src.abbas;

public class circle2 {
    private int radius;
    int setRadius(int radius){
        this.radius=radius;
        return this.radius;
    }
    int getRadius(){
        return this.radius;
    }
    double getcircumference(){
        return  2 * this.radius* Math.PI ;    
    }
    double getArea(){
        return Math.PI*Math.pow(this.radius, 2);

    }
    
}
