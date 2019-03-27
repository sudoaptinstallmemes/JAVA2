import javafx.scene.canvas.*;
import javafx.scene.paint.*;

public class GRAPH {
    private int sX;
    private int sY;
    private double scale;
    private int height;
    String color;
    /*
    default constructor
    sX = sY = 0;
    scales is set to 1
     */
    public GRAPH()
    {
        scale = 1;
    }

    public GRAPH(int sX, int sY, double scale, int height)
    {
        setCoordinates(sX,sY);
        setScale(scale);
        setHeight(height);
//        setColor(color);
    }
    public GRAPH setCoordinates( int sX, int sY)
    {
        this.sX = sX;
        this.sY = sY;
        return this;
    }
    public GRAPH setScale( double scale)
    {
        this.scale = ( scale > 0 ? scale : this.scale);
        return this;

    }

    public GRAPH setHeight(int height )
    {
        this.height = height;
        return this;
    }


    public void draw( GraphicsContext gc)
    {
        gc.setFill(Color.BLACK);
        gc.fillRect(sX+100, 700-height, 50, height);
//        gc.fillRect(sX+100, height, 50, height/2);

    }

}
