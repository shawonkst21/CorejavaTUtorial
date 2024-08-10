package lamdaEx;
@FunctionalInterface
interface A
{
    void show();
}


public class Main {
    public static void main(String[] args) {
        A obj=new A()
        {
            @Override
            public void show() {
                System.out.println("in show mwthod");
            }
        };
        obj.show();

    }
}
