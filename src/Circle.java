public class Circle {
    private  double pi;
    private  float radius;

    public Circle(double pi, float radius) {
        this.pi = pi;
        this.radius = radius;

    }

  public double area() {
     return pi*(radius*radius) ;
   }
    public double circumference(){
       return pi*2*radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                '}';
    }
}
