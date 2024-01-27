abstract class Shape{
    int length,breadth,radius;
    Shape(int l, int b){
        length= l;
        breadth=b;
    }
    Shape(int r){
        radius=r;
    }
    abstract void printArea();
}
class rectangle extends Shape{
    rectangle(int l,int b){
        super(l,b);
    }
    void printArea(){
        System.out.println("The area of the rectangle is "+(length*breadth));
    }

}
class triangle extends Shape{
    triangle(int l,int b){
        super(l,b);
    }
    void printArea(){
        System.out.println("The area of the triangle is "+(0.5*length*breadth));
    }

}
class circle extends Shape{
    circle(int r){
        super(r);
    }
    void printArea(){
        System.out.println("The area of the circle is "+(3.14*radius*radius));
    }

}
public class area {
    public static void main(String[]args){
        rectangle rec= new rectangle(3,5);
        rec.printArea();
        triangle tri= new triangle(3,5);
        tri.printArea();
        circle cir= new circle(5);
        cir.printArea();
        Shape t= new rectangle(3, 5);
        t.printArea();
        Shape s= new circle(5);
        s.printArea();
    }
} 