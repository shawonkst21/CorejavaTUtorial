package lamdaEx;
@FunctionalInterface
interface A
{
    int show(int x,int y);
}


public class Main {
    public static void main(String[] args) {
        A obj=(int x,int y)-> {
            return x + y;
        };
       int res= obj.show(5,8);
        System.out.println(res);


    }
}
