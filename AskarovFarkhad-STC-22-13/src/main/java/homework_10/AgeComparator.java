package homework_10;

import java.util.Comparator;

public class AgeComparator implements Comparator<Human> {

    @Override
    public int compare(Human first, Human second) {
        if (first.getAge() == second.getAge()) return 0;
        else if (first.getAge() > second.getAge()) return 1;
        else return -1;
    }

}
