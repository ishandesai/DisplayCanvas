/**
 * Abstract class representing a generic shape.
 * Each shape has a unique ID.
 */
public abstract class CShape {
    private static int counter = 0;
    protected final int id;

    /**
     * Constructor for CShape.
     * Assigns a unique ID to the shape.
     */
    public CShape() {
        id = ++counter;
    }

    /**
     * Abstract method to describe the shape.
     * @return String describing the shape.
     */
    public abstract String describe();
}
