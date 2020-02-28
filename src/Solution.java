import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList <Figure> figureArrayList = new ArrayList<>();
        int numberOfRandomFigures = random(10, 100);
        for(int x = numberOfRandomFigures; x >= 0; x--){
            int randomFigureSelection = random(1,4);
            if(randomFigureSelection == 1)
                figureArrayList.add(Square.getRandomSquare());
            if(randomFigureSelection == 2)
                figureArrayList.add(Triangle.getRandomTriangle());
            if(randomFigureSelection == 3)
                figureArrayList.add(Circle.getRandomCircle());
            if(randomFigureSelection == 4)
                figureArrayList.add(Trapeze.getRandomTrapeze());
        }
        for(Figure f : figureArrayList){
            System.out.println(f.toString());
        }
    }
    //генератор случайных чисел в интервале min - max
    public static int random (int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}