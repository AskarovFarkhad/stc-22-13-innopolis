package oldVersion.kolhozNumberOne;

public class MagazineBox {

    private Magazine magazine;

    public MagazineBox(Magazine magazine) {
        this.magazine = magazine;
    }

    public MagazineBox() {}

    public Magazine getMagazine() {
        Magazine tempMagazine = magazine;
        magazine = null;
        return tempMagazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
}
