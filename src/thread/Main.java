package thread;

public class Main extends Thread{
    public static void main(String[] args) {
        Main thread=new Main();
        thread.start();
        System.out.println("out side the threads");

    }

    @Override
    public void run() {
        super.run();
        System.out.println("inside the threADS");
    }
}
