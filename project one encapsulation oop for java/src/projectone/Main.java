package projectone;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Beagle");
        Human human = new Human("Alice", 29);

        System.out.println(human);
        System.out.println(dog);

        human.adoptDog(dog);
        human.feedDog(dog);
        human.walkDog(dog);

        dog.sit();
    }
}
