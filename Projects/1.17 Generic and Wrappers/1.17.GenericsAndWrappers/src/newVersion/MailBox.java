package newVersion;

//Почтовый ящик
public class MailBox <T> {

    private T mail;

    public MailBox(T mail) {
        this.mail = mail;
    }

    public MailBox() {
    }

    public T getMail() {
        return mail;
    }

    public void setMail(T mail) {
        this.mail = mail;
    }
}
