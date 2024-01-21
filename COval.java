/**
 * Class representing an oval shape.
 * Inherits from CShape.
 */
public class COval extends CShape {
    protected int horizontalRadius;
    protected int verticalRadius;

    /**
     * Constructor for COval.
     * @param horizontalRadius The horizontal radius of the oval.
     * @param verticalRadius The vertical radius of the oval.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String describe() {
        return "Shape " + id + ": OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}
