package question;

//Имплементация двух интерфейсов с одним и тем же методом
//Имплементирует в порядке очереди
public class TestClass implements TestInterfaceNumberTwo, TestInterfaceNumberOne{

    @Override
    public void test() {
        System.out.println("test");
    }
}
