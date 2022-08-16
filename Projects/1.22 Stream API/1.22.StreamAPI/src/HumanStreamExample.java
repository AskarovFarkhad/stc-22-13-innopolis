import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HumanStreamExample {

    public static void main(String[] args) {
        File file = new File("DataBaseHuman.txt");
        List<Human> humans = new ArrayList<>();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }

            writer.write("Oleg|Igonin|male|26\n");
            writer.write("Igor|Igonin|male|20\n");
            writer.write("Leonid|Igonin|male|40\n");

            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка, плак:С");
        }


//        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
//            String human;
//
//            while ((human = reader.readLine()) != null) {
//                String[] info = human.split("\\|");
//                //Human newHuman = new Human(info[0], info[1], info[2], Integer.parseInt(info[3]));
//                String name = info[0];
//                String lastName = info[1];
//                String sex = info[2];
//                int age = Integer.parseInt(info[3]);
//
//                Human newHuman = new Human(name, lastName, sex, age);
//                humans.add(newHuman);
//            }
//        } catch (IOException e) {
//            System.out.println("Плак :С");
//        }
        //.lines() - берет все строки файла и запихивает их в поток -> превращает все строки файла в поток типа String
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            humans = reader.lines()
                    .map(human -> {
                        String[] info = human.split("\\|");
//                        String name = info[0];
//                        String lastName = info[1];
//                        String sex = info[2];
//                        int age = Integer.parseInt(info[3]);
//
//                        Human newHuman = new Human(name, lastName, sex, age);
                        return new Human(info[0], info[1], info[2], Integer.parseInt(info[3]));
                    })
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Plac:C");
        }


//        humans.stream()
//                .filter(human -> human.getAge() > 20 && human.getAge() < 40)
//                .map(stroke -> stroke.getName())
//                .forEach(System.out::println);

    }
}
