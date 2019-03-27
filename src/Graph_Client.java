import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Graph_Client extends Application
{

    private GRAPH s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;

    @Override
    public void start ( Stage stage)
    {
        GraphicsContext gc  = JIGraphicsUtility.setUpGraphics( stage, "Weather Graph", 1000, 1200);
//        s1 = new GRAPH(0, 0, 1, 310);
//        s2 = new GRAPH(70, 0, 1, 240);
//        s3 = new GRAPH(140, 0, 1, 450);
//        s4 = new GRAPH(210, 0, 1, 600);
//        s5 = new GRAPH(280, 0, 1, 690);
//        s6 = new GRAPH(350, 0, 1, 800);
//        s7 = new GRAPH(420, 0, 1, 880);
//        s8 = new GRAPH(490, 0, 1, 870);
//        s9 = new GRAPH(560, 0, 1, 750);
//        s10 = new GRAPH(630, 0, 1, 650);
//        s11 = new GRAPH(700, 0, 1, 430);
//        s12 = new GRAPH(770, 0, 1, 230);

        s1 = new GRAPH(0, 310, 1, 310/2);
        s2 = new GRAPH(70, 240, 1, 240/2);
        s3 = new GRAPH(140, 450, 1, 450/2);
        s4 = new GRAPH(210, 600, 1, 600/2);
        s5 = new GRAPH(280, 690, 1, 690/2);
        s6 = new GRAPH(350, 800, 1, 800/2);
        s7 = new GRAPH(420, 880, 1, 880/2);
        s8 = new GRAPH(490, 870, 1, 870/2);
        s9 = new GRAPH(560, 750, 1, 750/2);
        s10 = new GRAPH(630, 650, 1, 650/2);
        s11 = new GRAPH(700, 4300, 1, 430/2);
        s12 = new GRAPH(770, 2300, 1, 230/2);


        s1.draw(gc);
        s2.draw(gc);
        s3.draw(gc);
        s4.draw(gc);
        s5.draw(gc);
        s6.draw(gc);
        s7.draw(gc);
        s8.draw(gc);
        s9.draw(gc);
        s10.draw(gc);
        s11.draw(gc);
        s12.draw(gc);


    }

    public static void main (String [] args)
    {
        launch(args);
    }
}
