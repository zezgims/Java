
public class Main {
    
    public static void main(String []args)
    {
        Animal animal = new Animal("Limon");
        Cat cat = new Cat("Tekir");
        Dog dog = new Dog("Karabaş");
        Horse horse = new Horse("Gazi");
        
        System.out.println(animal.Speak());
        System.out.println(cat.Speak());
        System.out.println(dog.Speak());
        System.out.println(horse.Speak()); 
    }
}
