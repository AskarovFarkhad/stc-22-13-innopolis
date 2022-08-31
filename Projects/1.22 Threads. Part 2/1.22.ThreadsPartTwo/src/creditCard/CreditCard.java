package creditCard;

public class CreditCard {

    private int amount;

    public CreditCard(int amount) {
        this.amount = amount;
    }

    public synchronized boolean buy(int cost) {
        if (amount >= cost) {
            this.amount -= cost;
            System.out.println("Successful");
            return true;
        }

        System.out.println("Failed!");
        return false;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
