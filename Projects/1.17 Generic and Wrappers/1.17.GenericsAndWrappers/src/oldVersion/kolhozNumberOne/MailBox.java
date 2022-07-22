package oldVersion.kolhozNumberOne;

//Почтовый ящик
public class MailBox {

    private Mail mail;

    public MailBox(Mail mail) {
        this.mail = mail;
    }

    public MailBox() {}

    public Mail getMail() {
        Mail tempMail = mail;
        mail = null;
        return tempMail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }
}
