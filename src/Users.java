import java.util.Objects;

public class Users {

    private String name;
    private int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "имя: " +this.name + ", лет: "+this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age && Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

