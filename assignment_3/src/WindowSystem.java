import de.rwth.hci.Graphics.GraphicsEventSystem;

import java.awt.*;
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
     * Translate vector to coordinate
     */
    private void setccords(float startX, float startY, float endX, float endY){
        this.startLineX = (int) (windowWidth * startX);
        this.startLineY = (int) (windowHeight * startY);
        this.endLineX = (int) (windowWidth * endX);
        this.endLineY = (int) (windowHeight * endY);

    }



    public void drawLine(float startX, float startY, float endX, float endY){
        System.out.println("Draw line with startx: " + startX + " starty: " + startY +
                " endx: " + endX + " endy " + endY);
        //calculate in coordinates
        super.setColor(Color.BLACK);
        setccords(startX, startY, endX, endY);
        //do the drawing
        super.drawLine(Math.round(startLineX),Math.round(startLineY),Math.round(endLineX),Math.round(endLineY));

    }

    public void drawRect(float LeftTopX ,float LeftTopY,float RightBottomX, float RightBottomY){
        this.rectBuffer.add(new Rectangle(100,100));


    }

    /*
     * Add new simple window to window system
     */
    public void AddNewWindow(int width,int height,float LeftTopX ,float LeftTopY,float RightBottomX, float RightBottomY){


        simpleWindows.add(
                new SimpleWindow(width,height,LeftTopX ,LeftTopY, RightBottomX,  RightBottomY)

        );

    }
    /*
     * (non-Javadoc)
     * override handle paint in parent
     * Set color and draw line using parent methods
     */
    @Override
    protected void handlePaint(){
         System.out.println("Draw line in coordinates: " + startLineX +
              " starty: " + startLineY + " endx: " + endLineX + " endy " + endLineY);





        //System.out.println("Drawing rectangle hey hey");
        drawLine(0.5f,0.5f,0.9f,0.9f);
        // for (Rectangle temp:rectBuffer) {
        //   this.drawRect(100,100,20,20);
        // System.out.print("rectangle");
        //this.fillRect(100,100,20,20);
        //}
    }


}
