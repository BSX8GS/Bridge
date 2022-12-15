public class Main {
    public static void main(String args[])
    {
        Blue blue = new Blue();
        Red red = new Red();


        BuildingBlock buildingBlock = new BuildingBlock(blue);
        Ball ball = new Ball(red);
        Ball blueball = new Ball(blue);

        System.out.println(buildingBlock.play());
        System.out.println(ball.play());
        System.out.println(blueball.play());
    }
}
