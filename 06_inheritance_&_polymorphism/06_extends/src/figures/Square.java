package figures;

public class Square extends Rectangle{

    public Square(int width, int height) {
        super(width, height);
        if (width != height) {
            System.out.println("O No! The width doesn't equals the height!");
        }
    }

    public Square(int width) {
        super(width, width);
    }

    public void setWidth(int width){
        setWidth(width);
        setHeight(width);
    }

    public void setHeight(int height){
        setHeight(height);
        setWidth(height);
    }

}
