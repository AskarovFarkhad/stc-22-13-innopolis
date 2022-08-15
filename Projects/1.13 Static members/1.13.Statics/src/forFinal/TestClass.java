package forFinal;

import forFinal.Human;

public class TestClass {
    //в данном случае - финальным (неизменным) является ссылка, которую
    //мы положим в переменную human при создании объекта TestClass
    //Ссылку, после инициализации, изменить нельзя, а вот состояние объекта
    //на который ссылается переменная human изменять можно
    private final Human human;

    public TestClass(Human human) {
        this.human = human;
    }

    public final void sayHello() {
        System.out.println("HELLO, GUYS");
    }

    public Human getHuman() {
        return human;
    }
}
