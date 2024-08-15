package advanceSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class student implements Comparable{
    int age;
    String name;
    public student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }



    public int compareTo(Object that) {
        student s1=(student) that;
        if(this.age>s1.age)
        {
            return 1;
        }
        else {
            return -1;
        }
    }


}
public class Main {
    public static void main(String[] args) {
        Comparator<student>com=(student o1, student o2)-> {
                return (o1.age>o2.age)?1:-1;
            };
        List<student>std=new ArrayList<student>();
        std.add(new student(21,"shawon"));
        std.add(new student (32,"uthfol"));
        std.add(new student(12,"nioti"));
        std.add(new student(44,"sadman"));
        Collections.sort(std);

        for(student s:std)
        {
            System.out.println(s.age+" "+s.name);
        }
    }
}
