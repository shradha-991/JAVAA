public class Circle {
    public void calculateArea() {
        double radius = 7;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    public static void main(String[] args) {
    
        Circle obj= new Circle();
        obj.calculateArea();
    }
}
