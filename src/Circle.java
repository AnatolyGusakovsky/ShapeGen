public class Circle extends Figure {

        private int radius;

        public Circle(int radius){
                super("круг", Figure.colors[(int) (Math.random() * 10)], 3.14*radius*radius);
                this.radius = radius;
        }
        public static Circle getRandomCircle(){
                return new Circle (Solution.random(1, 100));
        }

        public int getRadius(){return this.radius;}

        @Override
        public String toString() {
                return String.format("Фигура: %s, площадь: %.2f кв. ед., радиус: %d ед., цвет: %s", this.getName(), this.getArea(), this.getRadius(), this.getColor());
        }
}
