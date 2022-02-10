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
    public String Talk()
    {
        return this.getname() + " meowing.";
    }
}

class Köpek extends Hayvan
{
    public Köpek(String isim)
    {
        super(isim);
    }
    
    @Override
    public String konuş()
    {
        return this.getisim() + " havlıyor.";
    }
}

class At extends Hayvan
{
    public At(String isim)
    {
        super(isim);
    }
    
    @Override
    public String konuş()
    {
        return this.getisim() + " kişniyor.";
    }
}

public class Main {
    
    public static void main(String []args)
    {
        Hayvan hayvan = new Hayvan("Limon");
        Hayvan hayvan2 = new Kedi("Tekir");
        Hayvan hayvan3 = new Köpek("Karabaş");
        Hayvan hayvan4 = new At("Gazi");
        
        System.out.println(hayvan.konuş());
        System.out.println(hayvan2.konuş());
        System.out.println(hayvan3.konuş());
        System.out.println(hayvan4.konuş());
    }
}
