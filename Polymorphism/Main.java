public class Main {
    
    public static void main(String []args)
    {
        Animal animal = new Animal("Limon");
        Animal cat = new Cat("Tekir");
        Animal dog = new Dog("Karabaş");
        Animal horse = new Horse("Gazi");
        
        System.out.println(animal.Speak());
        System.out.println(cat.Speak());
        System.out.println(dog.Speak());
        System.out.println(horse.Speak());
    }
}
