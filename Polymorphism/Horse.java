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
