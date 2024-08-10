package functionalInterface;
@FunctionalInterface
interface demo{
  void show();

}
class ji implements demo{

    @Override
    public void show() {
        System.out.println("in Demo");
    }
}

public class Main {
    public static void main(String[] args) {
        //demo.display();
        ji hi=new ji();
        hi.show();

    }

}
