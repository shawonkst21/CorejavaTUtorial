package staticVariable;
 class demo{
    static String name;
    demo(String name)
    {
        this.name=name;
    }
    public static void display()
    {
        System.out.println(name);
    }

}
public class Main {
    public static void main(String[] args) {

        demo.display();//STATIC METHOD CAN EASILY ACCESS WITHOUT CREATING OBJECT

    }
}
