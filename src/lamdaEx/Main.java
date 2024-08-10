package lamdaEx;
@FunctionalInterface
interface A
{
    void show(int x);
}


public class Main {
    public static void main(String[] args) {
        A obj=(int x)-> System.out.println("in show mwthod "+x);
        obj.show(5);

    }
}
