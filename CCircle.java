/**
 * Class representing a circle.
 * Inherits from COval.
 */
public class CCircle extends COval {
    /**
     * Constructor for CCircle.
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String describe() {
        return "Shape " + id + ": CIRCLE " + horizontalRadius;
    }
}
