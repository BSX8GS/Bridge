public class Ball extends Toy{
    public Ball(Colour c) {
        super(c);
    }
    @Override
    public String play()
    {
        return super.play() + " ball.";
    }
}
