public class Duck extends Animal {

    public Duck(String name, double weight, int age) {
        super(name, weight, age);
    }

    public Duck() { }

    public void move(){
        System.out.println("Утка по кличке "+ super.getName() +" летит в небе");
    }
}
