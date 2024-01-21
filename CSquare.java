/**
 * Class representing a square.
 * Inherits from CRectangle.
 */
public class CSquare extends CRectangle {
    /**
     * Constructor for CSquare.
     * @param side The length of each side of the square.
     */
    public CSquare(int side) {
        super(side, side);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String describe() {
        return "Shape " + id + ": SQUARE " + length + "x" + length;
    }
}
