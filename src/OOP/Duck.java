package OOP;

public class Duck extends Animal {

    public Duck(String name, double weight, int age) {
        super(name, weight, age);
    }

    public Duck() { }

    @Override
    public void move(){
        System.out.println("Утка по кличке "+ super.getName() +" летит в небе");
    }

    public void kryak(){
        System.out.println("Утка крякает");
    }
}
