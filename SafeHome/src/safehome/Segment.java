package SafeHome;

/**
 *
 * @author Tunde
 */
public class Segment {

	private int type;
	private int wallDimension;
	private int startCoordinates;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getWallDimension() {
        return wallDimension;
    }

    public void setWallDimension(int wallDimension) {
        this.wallDimension = wallDimension;
    }

    public int getStartCoordinates() {
        return startCoordinates;
    }

    public void setStartCoordinates(int startCoordinates) {
        this.startCoordinates = startCoordinates;
    }

    public int getEndCoordinates() {
        return endCoordinates;
    }

    public void setEndCoordinates(int endCoordinates) {
        this.endCoordinates = endCoordinates;
    }
	private int endCoordinates;

    /**
     *
     */
    public void draw() {
		// TODO - implement Segment.draw
		throw new UnsupportedOperationException();
	}

}