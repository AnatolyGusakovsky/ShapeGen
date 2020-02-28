public abstract class Figure {
    private String color;
    private double area;
    private String name;

    public Figure(String name, String color, double area){
        this.name = name;
        this.color = color;
        this.area = area;
    }

public void paintFigure(){
    System.out.println("Нарисован" + this.name + ". Цвет - " + this.color);
}
public String getColor() {return this.color;}
public double getArea() {return this.area;}
public String getName() {return this.name;}

public static String[] colors = new String [] {"белый", "чёрный", "серый", "жёлтый", "зелёный", "оранжевый", "красный", "коричневый", "голубой", "синий"};
}
