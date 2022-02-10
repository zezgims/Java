class Animal
{
    private String name;
    
    public Animal(String name)
    {
        this.name = name;
    }
    
    public String getname()
    {
        return name;
    }
    
    public void setname(String name)
    {
        this.name = name;
    }
    
    public String Speak()
    {
        return "Animal speaks";
    }
}

class Cat extends Animal
{
    public Cat(String name)
    {
        super(name); 
    }

    @Override
    public String Speak()
    {
        return this.getname() + " meowing.";
    }
}

class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    
    @Override
    public String Speak()
    {
        return this.getname() + " barking.";
    }
}

class Horse extends Animal
{
    public Horse(String name)
    {
        super(name);
    }
    
    @Override
    public String Speak()
    {
        return this.getname() + " neighing.";
    }
}

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
