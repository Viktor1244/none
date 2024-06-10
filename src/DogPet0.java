public class DogPet0 extends Pet0 implements ANimal {
    public void makeSound() {
        System.out.println("Woof!");
    }
    
    public void eat(String food) {
        System.out.println("The dog is eating " + food);
    }
    
    public void play() {
        System.out.println("The dog is playing.");
    }
}
