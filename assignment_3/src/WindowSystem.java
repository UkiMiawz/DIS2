import de.rwth.hci.Graphics.GraphicsEventSystem;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class WindowSystem extends GraphicsEventSystem{

    //window system width and height
    private int windowWidth;
    private int windowHeight;
    //list of Windows in current window system
    private List<SimpleWindow> simpleWindows;
    private List<Rectangle> rectBuffer;

    //line x and y start position in coordinates
    private int startLineX;
    private int startLineY;
    //line x and y end position in coordinates
    private int endLineX;
    private int endLineY;

    /*
     * Constructor
     */
    public WindowSystem(int width, int height){
        //save window width and height
        super(width, height);
        windowWidth = width;
        windowHeight = height;
        //instantiate new list
        simpleWindows = new ArrayList<SimpleWindow>();
        rectBuffer = new ArrayList<Rectangle>();
    }

    /*
     * (non-Javadoc)
     * override handle paint in parent
     * Set color and draw line using parent methods
     */
    @Override
    protected void handlePaint(){
        //System.out.println("Draw line in coordinates: " + startLineX +
         //       " starty: " + startLineY + " endx: " + endLineX + " endy " + endLineY);
        //put set color and draw line here because calling them outside handle paint gives error message
        super.setColor(Color.BLACK);

        System.out.print("Drawing rectangle ");
        /*
        for (Rectangle temp:rectBuffer) {
            super.drawRect(100,100,20,20);
            System.out.print("rectangle");
            super.fillRect(100,100,20,20);
        }*/
    }

    /*
     * Translate vector to coordinate
     */
    private void setccords(float startX, float startY, float endX, float endY){
        startLineX = (int)(windowWidth * startX);
        startLineY = (int)(windowHeight * startY);
        endLineX = (int)(windowWidth * endX);
        endLineY = (int)(windowHeight * endY);

    }



    public void drawLine(float startX, float startY, float endX, float endY){
        System.out.println("Draw line with startx: " + startX + " starty: " + startY +
                " endx: " + endX + " endy " + endY);
        //calculate in coordinates
        setccords(startX, startY, endX, endY);
        //do the drawing

    }

    public void drawRect(float LeftTopX ,float LeftTopY,float RightBottomX, float RightBottomY){
        this.rectBuffer.add(new Rectangle(100,100));


    }

    /*
     * Add new simple window to window system
     */
    public void AddNewWindow(int width,int height,float LeftTopX ,float LeftTopY,float RightBottomX, float RightBottomY){
        System.out.print("aasdjhbsadb");
        simpleWindows.add(
                new SimpleWindow(width,height,LeftTopX ,LeftTopY, RightBottomX,  RightBottomY)

        );

    }


}
