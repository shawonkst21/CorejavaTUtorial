package Anonymous;
 abstract class A
{
  public abstract void  show();
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
