import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Sprite_Client extends Application
{

    private Sprite s1, s2, s3;

    @Override
    public void start ( Stage stage)
    {
        GraphicsContext gc  = JIGraphicsUtility.setUpGraphics( stage, "Sprites", 700, 400);
        s1 = new Sprite(100, 50, 0.5);
        s2 = new Sprite();
        s3 = new Sprite();

        s1.draw(gc);
        s2.draw(gc);
        s3.draw(gc);

    }

    public static void main (String [] args)
    {
        launch(args);
    }
}
