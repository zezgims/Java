
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
