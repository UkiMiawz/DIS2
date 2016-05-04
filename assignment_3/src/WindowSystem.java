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

    public void drawRect(int LeftTopX ,int LeftTopY,int RightBottomX, int RightBottomY){

        System.out.println("drawing rectangle");
        super.setColor(Color.BLACK);
        super.drawRect(LeftTopX , LeftTopY, RightBottomX, RightBottomY);

        System.out.println("filling rectangle");
        super.setColor(Color.BLACK);
        super.fillRect(LeftTopX , LeftTopY, RightBottomX, RightBottomY);
        AddNewWindow(LeftTopX ,LeftTopY, RightBottomX,  RightBottomY);







    }

    /*
     * Add new simple window to window system
     */
    public void AddNewWindow(int LeftTopX ,int LeftTopY,int RightBottomX, int RightBottomY){


        simpleWindows.add(
                new SimpleWindow(LeftTopX ,LeftTopY, RightBottomX,  RightBottomY)

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




         //for (Rectangle temp:rectBuffer) {
        System.out.println("rectangle1");
        this.drawRect(5,5,50,50);
        this.drawRect(300,300,600,600);
        this.drawRect(200,200,400,400);
        for (SimpleWindow t:simpleWindows
             ) {System.out.println(t.getID());

        }
        System.out.println("rectangle2");




        //}
    }


}
