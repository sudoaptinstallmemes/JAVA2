import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Graph_Client extends Application
{

    private GRAPH s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;

    @Override
    public void start ( Stage stage)
    {
        GRAPH start = new GRAPH();
        start.prompt();
        GraphicsContext gc  = JIGraphicsUtility.setUpGraphics( stage, "Weather Graph", 1000, 1200);


        s1 = new GRAPH(0, 310, 1, start.tempList.get(0)*10, "Jan");
        s2 = new GRAPH(70, 240, 1, start.tempList.get(1)*10,"Feb");
        s3 = new GRAPH(140, 450, 1, start.tempList.get(2)*10,"Mar");

        s4 = new GRAPH(210, 600, 1, start.tempList.get(3)*10,"Apr");
        s5 = new GRAPH(280, 690, 1, start.tempList.get(4)*10,"May");

        s6 = new GRAPH(350, 800, 1, start.tempList.get(5)*10,"Jun");
        s7 = new GRAPH(420, 880, 1, start.tempList.get(6)*10,"Jul");
        s8 = new GRAPH(490, 870, 1, start.tempList.get(7)*10,"Aug");

        s9 = new GRAPH(560, 750, 1, start.tempList.get(8)*10,"Sep");
        s10 = new GRAPH(630, 650, 1, start.tempList.get(9)*10,"Oct");

        s11 = new GRAPH(700, 4300, 1, start.tempList.get(10)*10,"Nov");
        s12 = new GRAPH(770, 2300, 1, start.tempList.get(11)*10,"Dec");

//        gc.setFill(Color.BLUE);
        s1.draw(gc,0);
        s2.draw(gc,1);
        s3.draw(gc,2);
//        gc.setFill(Color.YELLOW);
        s4.draw(gc,3);
        s5.draw(gc,4);
//        gc.setFill(Color.RED);
        s6.draw(gc,5);
        s7.draw(gc,6);
        s8.draw(gc,7);
//        gc.setFill(Color.YELLOW);
        s9.draw(gc,8);
        s10.draw(gc,9);
//        gc.setFill(Color.BLUE);
        s11.draw(gc,10);
        s12.draw(gc,11);


    }

    public static void main (String [] args)
    {
        launch(args);
    }
}
