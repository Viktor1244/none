public class CatPet0 extends Pet0 implements ANimal {
    public void makeSound() {
        System.out.println("Meow!");
    }
    
    public void eat(String food) {
        System.out.println("The cat is eating " + food);
    }
    
    public void play() {
        System.out.println("The cat is playing.");
    }
}
