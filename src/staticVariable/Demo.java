package staticVariable;

public class Demo {
   static String name;
    public Demo(String name)
    {
        this.name=name;
    }
    public static void show()
    {
        System.out.println(name);
    }
}
