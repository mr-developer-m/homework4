package Homework1;

class Shape   {
    String color;   // it holds the color of the figure


    void draw ()  {
        System.out.println("drawing a shape");   // it is drawn the figure
    }
    double calculateArea()   {

        return 0;
    }

}
class Circle extends Shape  {
    double radious ;  // it holds the radios of the circle

    public Circle(String color,double radious)   {
        this.color = color;
        this.radious =radious;
    }

    @Override
    void draw() {
        System.out.println("drawing the circle");
    }


    @Override
    double calculateArea() {
        return (radious * radious);
    }
}

class Rectangle extends Shape    {
    double width  ;  // it holds the rectangle's weight
    double height ;   // it holds the rectangle's height
    public Rectangle(String color, double width, double height)   {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("drawing a rectangle");
    }



    @Override
    double calculateArea() {
        return (width * height);
    }
}

class Triangle extends Shape   {
    double base; // it holds the triangles base lenght
    double height;  // it holds the triangles height
    public Triangle(String color, double base, double height)   {
        this.color = color;
        this.base = base;
        this.height = height;
    }
    @Override
    void draw() {
        System.out.println("drawing a triangle");
    }


    @Override
    double calculateArea() {
        return((base * height) / 2);
    }
}

public class FiguresAndTypesOfFigures {
    public static void main(String[] args) {
        Circle c = new Circle("blue", 5);
        Rectangle r = new Rectangle("red",12, 6);
        Triangle t = new Triangle("yellow", 8,16);

        c.draw();
        System.out.println("the circle's area is : " + c.calculateArea() + " π");

        r.draw();
        System.out.println("the rectangle's area is: " + r.calculateArea() + " m2");

        t.draw();
        System.out.println("the triangle's area is: " + t.calculateArea() + " m2");

    }
}
