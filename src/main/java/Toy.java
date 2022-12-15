public abstract class Toy {
    protected Colour c;

    public Toy(Colour c) {
        this.c = c;
    }

    public String play()
    {
        return "Playing with the "+c.colour;
    }
}
