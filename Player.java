public class Player {
    //player current position 
    private Position position;

    //map dimensions
    public int gridWidth;
    public int gridHeight;

    //starting position constructor
    public Player(Position playerPosition, int width, int height) {
        position = playerPosition;
        gridWidth = width;
        gridHeight = height;
    }

    public boolean inBounds(int x, int y) {
        if (x >= 0 && x <= gridWidth - 1 && y >= 0 && y <= gridHeight - 1) return true;
        return false;
    }

    //movement methods
    public void moveUp() {
        if (inBounds(position.getX(), position.getY() - 1)) {
            position.setY(position.getY() - 1);
        } else {
            System.out.println("You can't move outside the map!");
        }
    }
    public void moveDown() {
        if (inBounds(position.getX(), position.getY() + 1)) {
            position.setY(position.getY() + 1);
        } else {
            System.out.println("You can't move outside the map!");
        }
    }
    public void moveRight() {
        if (inBounds(position.getX() + 1, position.getY())) {
            position.setX(position.getX() + 1);
        } else {
            System.out.println("You can't move outside the map!");
        }
    }
    public void moveLeft() {
        if (inBounds(position.getX() - 1, position.getY())) {
            position.setX(position.getX() - 1);
        } else {
            System.out.println("You can't move outside the map!");
        }
    }

    public String getPosition() {
        return position.toString();
    }
}
