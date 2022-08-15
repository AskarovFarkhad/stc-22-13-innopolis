package map.newVersion;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card[] cards = new Card[5];
        //for(Card card : cards) {
        //   card = new Card(scanner.next());
        // }
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card(scanner.next());
        }
        //Сначала идет ключ, на основе которого у нас вычисляется сначала номер корзины
        //а потом, если в корзине что то лежит, идет сравнение ключей через equals()
        Map<Card, Integer> map = new HashMap<>();

        for (int i = 0; i < cards.length; i++) {
            if (map.containsKey(cards[i])) {
                int temp = map.get(cards[i]);
                temp++;
                map.put(cards[i], temp);
                //map.put(cards[i], map.get(cards[i])++);
            } else {
                map.put(cards[i], 1);
            }
        }

        System.out.println(Arrays.toString(cards));

//        if (map.size() == 1) {
//            System.out.println("Zhuuuuuulik");
//        } else if (map.size() == 2) {
//            if (checkValues(map, 4)) {
//                System.out.println("Kare");
//            } else {
//                System.out.println("Full house");
//            }
//        } else if (map.size() == 3) {
//            if (checkValues(map, 3)) {
//                System.out.println("Set");
//            } else {
//                System.out.println("Two pair");
//            }
//        } else if (map.size() == 4) {
//            System.out.println("One pair");
//        } else {
//            System.out.println("Loshara");
//        }

        switch (map.size()) {
            case 1:
                System.out.println("Zhuuuuuulik");
                break;
            case 2:
                if (checkValues(map, 4)) {
                    System.out.println("Kare");
                } else {
                    System.out.println("Full house");
                }
                break;
            case 3:
                if (checkValues(map, 3)) {
                    System.out.println("Set");
                } else {
                    System.out.println("Two pair");
                }
                break;
            case 4:
                System.out.println("One pair");
                break;
            case 5:
                System.out.println("Loshara");
                break;
        }
    }

    public static boolean checkValues(Map<Card, Integer> map, int number) {
        ArrayList<Integer> list = new ArrayList<>(map.values());

        for (Integer integer : list) {
            if (integer == number) {
                return true;
            }
        }

        return false;
    }
}
