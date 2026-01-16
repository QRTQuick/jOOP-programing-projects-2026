package projectone;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void adoptDog(Dog dog) {
        System.out.println(name + " adopted " + dog.getName() + ".");
    }

    public void feedDog(Dog dog) {
        System.out.println(name + " feeds " + dog.getName() + ".");
    }

    public void walkDog(Dog dog) {
        System.out.println(name + " walks " + dog.getName() + ".");
        dog.bark();
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', age=" + age + "}";
    }
}
