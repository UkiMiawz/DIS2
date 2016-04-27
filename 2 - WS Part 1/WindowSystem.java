/**
 * Created by asifmayilli on 4/27/16.
 */
import de.rwth.hci.Graphics.GraphicsEventSystem;

import java.awt.*;

import static java.awt.Color.BLACK;

public class WindowSystem extends GraphicsEventSystem{

    public  WindowSystem( int width, int height) {
        super(width,height);}


    protected void handlePaint() {
        this.setColor(Color.BLACK);
        // Your test program should display a single line from (0.2, 0.3) to
        // (0.8, 0.7) on your “desktop”
        this.drawLine(0.2, 0.3, 0.8, 0.7);

    }

    protected void drawLine(float xs,float ys,float xe,float ye){
        super.drawLine(xs,ys,xe,ye);

    }
    public void setColor(Color col){
        super.setColor(col);
    }

    public static void main(String[] args){WindowSystem windowsystem = new WindowSystem(200,200);
        windowsystem.handlePaint();


    }
}








