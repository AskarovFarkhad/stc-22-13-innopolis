package oldVersion.kolhozNumberTwo;

import oldVersion.kolhozNumberOne.BoxBox;

public class Main {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();

        //mailBox.setMagazine(new Magazine("Мурзилка"));
        Box box = new Box("Для Васи Пупкина");
        Mail mail = new Mail("Наши Вашим приветы машут");
        Magazine magazine = new Magazine("Мурзилка");

        mailBox.setBox(box);

        System.out.println(mailBox.getBox().getName());

        mailBox.setMail(mail);

        System.out.println(mailBox.getMail().getMessage());

        mailBox.setMagazine(magazine);

        System.out.println(mailBox.getMagazine().getName());
    }
}
