package Enum;
enum laptop{

    macbook(22000),hp(1122),dell(3444),thikpadd(300),sufrface(8999);
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private laptop(int price)
    {
        this.price=price;
    }
}
public class Main {
    public static void main(String[] args) {
        for(laptop lap:laptop.values())
        {
            System.out.println(lap+":"+lap.getPrice());
        }

    }
}
