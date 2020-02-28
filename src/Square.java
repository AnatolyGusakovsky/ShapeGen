
public class Square extends Figure {

    private int side;

    public Square (int side){
        super("квадрат", Figure.colors[(int) (Math.random() * 10)], side*side);
        this.side = side;
    }
    public static Square getRandomSquare(){
        return new Square((int) (Math.random() * 100));
    }

    public int getSideLength(){return this.side;}

    @Override
    public String toString() {
        return String.format("Фигура: %s, площадь: %.2f кв. ед., длина стороны: %d ед., цвет: %s", this.getName(), this.getArea(), this.getSideLength(), this.getColor());
    }
}
