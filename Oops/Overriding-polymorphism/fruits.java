class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste      : " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Apple is Sweet");
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Orange is Sour");
    }
}

public class fruits {

    public static void main(String[] args) {

        Fruit f1 = new Apple();
        Fruit f2 = new Orange();

        f1.eat();
        f2.eat();
    }
}