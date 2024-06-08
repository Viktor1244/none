import java.util.ArrayList;
import java.util.List;

public class main4_1 {



}

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getInfo();

    public abstract void customizeInfo(String customInfo);
}

class Dog extends Animal {
    private String breed;
    private String customInfo;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String getInfo() {
        return "Dog: [Name: " + name + ", Age: " + age + ", Breed: " + breed + "]" +
                (customInfo != null ? ", Custom Info: " + customInfo : "");
    }

    @Override
    public void customizeInfo(String customInfo) {
        this.customInfo = customInfo;
    }
}

class Cat extends Animal {
    private String color;
    private String customInfo;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Cat: [Name: " + name + ", Age: " + age + ", Color: " + color + "]" +
                (customInfo != null ? ", Custom Info: " + customInfo : "");
    }

    @Override
    public void customizeInfo(String customInfo) {
        this.customInfo = customInfo;
    }
}

class PetStore {
    private List<Animal> animals;

    public PetStore() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(String name) {
        animals.removeIf(animal -> animal.name.equals(name));
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
        }
    }

    public void customizeAnimalInfo(String name, String customInfo) {
        for (Animal animal : animals) {
            if (animal.name.equals(name)) {
                animal.customizeInfo(customInfo);
                break;
            }
        }
    }
}