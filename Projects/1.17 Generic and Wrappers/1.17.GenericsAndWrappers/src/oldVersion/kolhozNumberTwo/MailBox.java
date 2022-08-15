package oldVersion.kolhozNumberTwo;

//Почтовый ящик
public class MailBox {

    private Mail mail;
    private Magazine magazine;
    private Box box;

    public MailBox(Mail mail) {
        this.mail = mail;
    }

    public MailBox(Magazine magazine) {
        this.magazine = magazine;
    }

    public MailBox(Box box) {
        this.box = box;
    }

    public MailBox() {
    }

    public Mail getMail() {
        Mail tempMail = mail;
        mail = null;
        return tempMail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Magazine getMagazine() {
        Magazine tempMagazine = magazine;
        magazine = null;
        return tempMagazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public Box getBox() {
        Box tempBox = box;
        box = null;
        return tempBox;
    }

    public void setBox(Box box) {
        this.box = box;
    }
}
