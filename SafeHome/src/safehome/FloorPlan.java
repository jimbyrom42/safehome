package SafeHome;

/**
 *
 * @author Tunde
 */
public class FloorPlan {

	private int type;
	private int name;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getOutsideDimensions() {
        return outsideDimensions;
    }

    public void setOutsideDimensions(int outsideDimensions) {
        this.outsideDimensions = outsideDimensions;
    }
	private int outsideDimensions;

    /**
     *
     */
    public void determinetype() {
		// TODO - implement FloorPlan.determinetype
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void positionFloorPlan() {
		// TODO - implement FloorPlan.positionFloorPlan
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void scale() {
		// TODO - implement FloorPlan.scale
		throw new UnsupportedOperationException();
	}

    /**
     *
     */
    public void changeFloor() {
		// TODO - implement FloorPlan.changeFloor
		throw new UnsupportedOperationException();
	}

}