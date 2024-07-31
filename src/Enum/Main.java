package Enum;
enum level{
    running,pending,success
}
public class Main {
    public static void main(String[] args) {
        //System.out.println(level.pending);
        for(level i:level.values())
        {
            if(i==level.success)
            {
                System.out.println("yea hu you are success");
            }
        }
    }
}
