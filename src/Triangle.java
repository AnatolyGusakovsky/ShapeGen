import static java.lang.Math.sqrt;


public class Triangle extends Figure {

    private int hypotenuse;
    private int leg; // катет

    // Area calculation actual only for right triangle!
    public Triangle(int hypotenuse, int leg){
        super("треугольник", Figure.colors[(int) (Math.random() * 10)], (0.5 * sqrt(hypotenuse*hypotenuse - leg*leg) * leg));
        this.hypotenuse = hypotenuse;
        this.leg = leg;
    }
    public static Triangle getRandomTriangle(){
        return new Triangle(Solution.random(20, 100), Solution.random(1, 19));
    }

    public int getHypotenuse(){return this.hypotenuse;}
    public int getLeg(){return this.leg;}

    @Override
    public String toString() {
        return String.format("Фигура: %s, площадь: %f кв. ед., длина гипотенузы: %s ед., длина катета: %s ед., цвет: %s", this.getName(), this.getArea(), this.getHypotenuse(), this.getLeg(), this.getColor());
    }
}
