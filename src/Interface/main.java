package Interface;
interface A
{
    void show();
    void config();
}
class B implements A{

    @Override
    public void show() {
        System.out.println("jiii");
    }

    @Override
    public void config() {
        System.out.println("juuuu");
    }
}
public class main {
    public static void main(String[] args) {
        A obj=new B();
        obj.config();
        obj.show();
    }
}
