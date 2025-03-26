package OOP;

public class Dog extends Animal {

    public  Dog (String name, double weight, int age) {
        super(name, weight, age);
    }
    public Dog (){ }

    @Override
    public void move(){
        System.out.println("Собакак по кличке " + super.getName()+" бежит по земле");
    }
}
