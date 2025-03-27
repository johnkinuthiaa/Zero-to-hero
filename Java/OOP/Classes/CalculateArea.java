package Java.OOP.Classes;

public class CalculateArea {
    // this class has length and width attributes and we will use them to calculate area and perimeter of a rectangle
    public double length;
    public double width;
    // an empty constructor
    public CalculateArea(){}
    // all args constructor
    public CalculateArea(double length,double width){
        // the this keyword is used to refer to the defined class attribute
        this.length =length;
        this.width=width;
    }

    // method for area calculation returns calculated area
    public double calculateArea(){
        return (this.length*this.width);
    }
    // method for perimeter calculation returns perimeter area
    public double calculatePerimeter(){
        return (this.length+this.width)*2;
    }

    public static void main(String[] args){
        CalculateArea rectangle1 =new CalculateArea(10, 20);
        double area= rectangle1.calculateArea();
        double perimeter=rectangle1.calculatePerimeter();
        System.out.println("The area of a "+rectangle1.length+"*"+rectangle1.width +" rectangle is "+area);
        System.out.println("The perimeter of a "+rectangle1.length+"*"+rectangle1.width +" rectangle is "+perimeter);
    }

}
