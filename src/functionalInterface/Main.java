package functionalInterface;
@FunctionalInterface
interface demo{
  void show();
 static void display()
 {
     System.out.println("in staic method");
 }
 default void presend()
 {
     System.out.println("in present");
 }


}
class Demo implements demo{

    @Override
    public void show() {
        System.out.println("in Demo");
    }
}

public class Main {
    public static void main(String[] args) {
        demo.display();
       // Demo d=new Demo();

    }

}
