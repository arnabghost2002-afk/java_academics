abstract class Animal{
    abstract void sound();
}
class dog extends Animal{
    @Override
    void sound() {
        System.out.println("DOG: BARK");
    }
}
class cat extends Animal{
    @Override
    void sound() {
        System.out.println("CAT: MEOW");
    }
}
class cow extends Animal{
    @Override
    void sound() {
        System.out.println("COW: MOO");
    }
}
public class Main{
    public static void main(String[]args){
        Animal a;
        a=new dog();
        a.sound();
        a=new cat();
        a.sound();
        a=new cow();
        a.sound();
    }
}
