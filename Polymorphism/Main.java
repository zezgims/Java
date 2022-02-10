public class Main {
    
    public static void main(String []args)
    {
        Animal animal = new Animal("Limon");
        Hayvan hayvan2 = new Cat("Tekir");
        Hayvan hayvan3 = new Dog("Karabaş");
        Hayvan hayvan4 = new Horse("Gazi");
        
        System.out.println(Animal.Speak());
        System.out.println(hayvan2.Speak());
        System.out.println(hayvan3.Speak());
        System.out.println(hayvan4.Speak());
    }
}
