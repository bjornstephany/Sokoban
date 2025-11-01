public class Position {
    public int x;
    public int y;

    //Constructor for initial x and y values
    public Position(int a, int b) {
        x = a;
        y = b;
    }

    //Getter methods for X and Y
    public int getX() {
        return x;
    }
    public int getY() { 
        return y;
    }

    //Setter methods for X and Y
    public void setX(int a) {
        x = a;
    }
    public void setY(int b) {
        y = b;
    }

    //A toString() method that returns a textual representation of the position, such as (2,3)
    public String toString() {
        return "(" + String.valueOf(x) + "," + String.valueOf(y) + ")";
    }
}
