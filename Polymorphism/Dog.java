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
