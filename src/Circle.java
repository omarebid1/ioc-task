public class Circle implements Shape {

    @Override
    public double getArea(double radius) {
        return radius * radius * Math.PI;
    }
}
