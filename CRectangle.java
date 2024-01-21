/**
 * Class representing a rectangle.
 * Inherits from CShape.
 */
public class CRectangle extends CShape {
    protected int length;
    protected int width;

    /**
     * Constructor for CRectangle.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String describe() {
        return "Shape " + id + ": RECTANGLE " + length + "x" + width;
    }
}
