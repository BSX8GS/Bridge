public class BuildingBlock extends Toy{
    public BuildingBlock(Colour c) {
        super(c);
    }

    @Override
    public String play()
    {
        return super.play() + " building block.";
    }
}
