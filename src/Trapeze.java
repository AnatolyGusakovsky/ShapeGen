public class Trapeze extends Figure {

    private int height;
    private int base1;
    private int base2;

    public Trapeze(int height, int base1, int base2){
        super("трапеция", Figure.colors[(int) (Math.random() * 10)], 0.5*(base1 + base2) * height);
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }
    public static Trapeze getRandomTrapeze(){
        return new Trapeze (Solution.random(30, 100), Solution.random(50, 100), Solution.random(20, 100));
    }

    public int getHeight(){return this.height;}
    public int getBase1(){return this.base1;}
    public int getBase2(){return this.base2;}

    @Override
    public String toString() {
        return String.format("Фигура: %s, площадь: %f кв. ед., высота: %s ед., нижнее основание : %s ед., верхнее основание : %s ед., цвет: %s", this.getName(), this.getArea(), this.getHeight(), this.getBase1(), this.getBase2(), this.getColor());
    }
}
