package Anonymous;
class A
{
    public void show()
    {
        System.out.println("hello world");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("hello");
            }
        };
        obj.show();
    }
}
