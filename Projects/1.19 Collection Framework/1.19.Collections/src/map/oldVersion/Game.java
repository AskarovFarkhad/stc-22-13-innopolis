package map.oldVersion;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Card[] cards = new Card[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card(scanner.next());
        }

        int[] countsCard = new int[5];

        for (int i = 0; i < cards.length; i++) {
            if (isCheck(countsCard)) {
                for (int j = i; j < cards.length; j++) {
                    if (cards[i].getValue().equals(cards[j].getValue())) {
                        //countsCard[i]++;
                        countsCard[i] = countsCard[i] + 1;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(countsCard));
    }

    public static boolean isCheck(int[] cards) {
        int result = 0;

        for (int card : cards) {
            result = result + card;
        }

        if (result >= 5) {
            return false;
        } else {
            return true;
        }
    }
}
