public class Main {
    public static void main(String[] args) {
       Circle circle=new Circle(3.14,7);
       circle.area();
       circle.circumference();
        System.out.println("Площадь круга: "+circle.area() );
        System.out.println("Окружность круга: "+circle.circumference());
        System.out.println(circle);

    }
}