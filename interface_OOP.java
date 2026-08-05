interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog: Bark");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat: Meow");
    }
}

class Cow implements Animal {
    public void sound() {
        System.out.println("Cow: Moo");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}
