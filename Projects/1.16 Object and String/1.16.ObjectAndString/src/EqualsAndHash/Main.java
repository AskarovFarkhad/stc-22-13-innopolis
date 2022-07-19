package EqualsAndHash;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("AUDI", "A6", "XTA121");
        Car anotherAudi = new Car("AUDI", "A6", "XTA122");
        Car bmw = new Car("BMW", "X5", "XTA123");

//        System.out.println(audi.equals(bmw));
//        System.out.println(bmw.equals(audi));

//        System.out.println(anotherAudi.equals(audi));
//        System.out.println(audi.equals(anotherAudi));

        //String text = new String("Is text");
        //text = "Is another text";
        String anotherText = "Is text";
        String oneMoreText = "Is text";

        String newText = new String("Is text");


        System.out.println(oneMoreText.equals(anotherText));
        System.out.println(anotherText.equals(newText));


//        System.out.println(audi.hashCode());
//        System.out.println(anotherAudi.hashCode());
//        System.out.println(bmw.hashCode());
    }
}
