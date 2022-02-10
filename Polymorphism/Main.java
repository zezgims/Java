public class Main {
    
    public static void main(String []args)
    {
        Animal animal = new Animal("Limon");
        Hayvan hayvan2 = new Kedi("Tekir");
        Hayvan hayvan3 = new Köpek("Karabaş");
        Hayvan hayvan4 = new At("Gazi");
        
        System.out.println(hayvan.konuş());
        System.out.println(hayvan2.konuş());
        System.out.println(hayvan3.konuş());
        System.out.println(hayvan4.konuş());
    }
}
