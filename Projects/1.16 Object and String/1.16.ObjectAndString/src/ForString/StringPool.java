package ForString;

public class StringPool {

    public static void main(String[] args) {
        String firstText = new String("Text");
        String secondText = new String("Text");
        String thirdText = "Text";
        String fourText = "Text";

        //Будет false, потому что при использовании конструктора, создается новый объект
        //мимо стринг пула.
        System.out.println(firstText == secondText);
        //Будет true, потому что строка создавалась без конструктора, и строка помещена в стринг пул
        System.out.println(thirdText == fourText);
        //Будет false, потому что ссылки разные (одна указывает на стринг пул, вторая на объект вне стринг пула
        System.out.println(firstText == fourText);
    }
}
