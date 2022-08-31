package creditCard;

public class Person extends Thread {

    private String namePerson;
    private CreditCard card;

    public Person(String namePerson, CreditCard card) {
        this.namePerson = namePerson;
        this.card = card;
        start();
    }

    @Override
    public void run() {
        System.out.println(namePerson + " идет совершать покупки");

        for (int i = 0; i < 100; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (card) {
                if (card.buy(10)) {
                    System.out.println(namePerson + " совершил покупку");
                } else {
                    System.out.println(namePerson + ": Лебовски, где деньги?");
                }
            }
        }
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String name) {
        this.namePerson = name;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
}
