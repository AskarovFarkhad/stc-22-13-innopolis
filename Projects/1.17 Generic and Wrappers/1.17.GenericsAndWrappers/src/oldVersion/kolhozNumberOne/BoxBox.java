package oldVersion.kolhozNumberOne;

public class BoxBox {

    private Box box;

    public BoxBox(Box box) {
        this.box = box;
    }

    public BoxBox() {}

    public Box getBox() {
        Box tempBox = box;
        box = null;
        return tempBox;
    }

    public void setBox(Box box) {
        this.box = box;
    }
}
