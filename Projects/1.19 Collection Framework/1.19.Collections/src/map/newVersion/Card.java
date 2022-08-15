package map.newVersion;

import java.util.Objects;

public class Card {

    private String value;

    public Card(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value.equals(card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
