package oldVersion.kolhozNumberOne;

public class Main {
    public static void main(String[] args) {
//        Mail mail = new Mail("Наши Вашим передают привет");
//
//        MailBox mailBox = new MailBox(mail);
//
//        System.out.println(mailBox.getMail().getMessage());
//
//        int i = 0;

//        Magazine magazine = new Magazine("Мурзилка");
//
//        MagazineBox magazineBox = new MagazineBox();
//
//        magazineBox.setMagazine(magazine);
//
//        System.out.println(magazineBox.getMagazine().getName());
//        System.out.println(magazineBox.getMagazine().getName());

        Box box = new Box("Для Васи Пупкина");

        BoxBox boxBox = new BoxBox();

        boxBox.setBox(box);

        System.out.println(boxBox.getBox().getName());
        System.out.println(boxBox.getBox().getName());

    }
}
