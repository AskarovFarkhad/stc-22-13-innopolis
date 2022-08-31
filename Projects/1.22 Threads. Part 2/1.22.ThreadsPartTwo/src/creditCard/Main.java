package creditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(950);

        new Person("Муж", card);
        new Person("Жена", card);
    }
}
