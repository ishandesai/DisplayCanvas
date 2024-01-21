import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Class representing a canvas holding shapes.
 */
public class CCanvas {
    private Set<CShape> shapes;

    /**
     * Constructor for CCanvas.
     * Initializes the canvas with random shapes.
     */
    public CCanvas() {
        shapes = new HashSet<>();
        generateRandomShapes();
    }

    /**
     * Generates 10 unique random shapes.
     */
    private void generateRandomShapes() {
        Random rand = new Random();
        while (shapes.size() < 10) {
            switch (rand.nextInt(4)) { // Randomly select a shape type
                case 0: // Circle
                    int radius = rand.nextInt(100) + 1; // Generate a radius between 1 and 100
                    shapes.add(new CCircle(radius));
                    break;
                case 1: // Oval
                    int hRadius = rand.nextInt(100) + 1;
                    int vRadius = rand.nextInt(100) + 1;
                    shapes.add(new COval(hRadius, vRadius));
                    break;
                case 2: // Rectangle
                    int length = rand.nextInt(100) + 1;
                    int width;
                    do {
                        width = rand.nextInt(100) + 1;
                    } while (width == length);
                    shapes.add(new CRectangle(length, width));
                    break;
                case 3: // Square
                    int side = rand.nextInt(100) + 1;
                    shapes.add(new CSquare(side));
                    break;
            }
        }
    }

    /**
     * Displays the contents of the canvas.
     */
    public void displayContents() {
        for (CShape shape : shapes) {
            System.out.println(shape.describe());
        }
    }
}
