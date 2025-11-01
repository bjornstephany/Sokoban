public class Game {
    public static void main(String[] args) {
        System.out.println("Sokobani starts!\n");

        //Step 2 test
        Position position = new Position(10, 10);
        System.out.println("Starting X: " + position.getX());
        System.out.println("Starting Y: " + position.getY());
        position.setX(2);
        position.setY(2);
        System.out.println("New position: " + position.toString() + "\n");

        //Step 3 test
        Player player = new Player(position, 5, 5);
        player.moveDown();
        player.moveRight();
        System.out.println("Down and Right: " + position.toString());
        player.moveUp();
        player.moveLeft();
        System.out.println("Up and left: " + position.toString() + "\n");

        //Step 4 draw a grid
        Position newPosition = new Position(0,0);
        Player newPlayer = new Player(newPosition, 5, 5);
        System.out.println("Position: " + newPosition.toString());
        int gridSize = 5;
        int x = newPosition.getX();
        int y = newPosition.getY();
        for(int i = 0; i < gridSize; i++) {
            for( int j = 0; j < gridSize; j++ ) {
                if (i == x && j == y) {
                    System.out.print("P ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        //Step 6 boundaries
        System.out.println("\nChecking all boundaries: ");
        //Top left
        newPlayer.moveUp();
        newPlayer.moveLeft();
        //Bottom right
        newPosition.setX(4);
        newPosition.setY(4);
        newPlayer.moveRight();
        newPlayer.moveDown();
    }
}
