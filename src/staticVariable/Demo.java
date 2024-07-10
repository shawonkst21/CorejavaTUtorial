package staticVariable;

public class Demo {
    String name;
    public Demo(String name)
    {
        this.name=name;
    }
    public static void show(Demo obj)
    {
        System.out.println(obj.name);
    }
}
