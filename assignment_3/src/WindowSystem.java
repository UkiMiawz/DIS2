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

    //line x and y start position in coordinates
    //private int startLineX;
    //private int startLineY;
    //line x and y end position in coordinates
    //private int endLineX;
    //private int endLineY;

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
        //rectBuffer = new ArrayList<Rectangle>();
    }

<<<<<<< HEAD



    public int setX(float X){return (int) Math.round(X*windowWidth);}
    public int setY(float Y) {return (int) Math.round(Y*windowHeight);}





=======
>>>>>>> 9aacecf6628979f153213205c3674a9f6390d44f
    /*
     * Translate vector to coordinate
     */
    //private void setccords(float startX, float startY, float endX, float endY){
    //    this.startLineX = (int) (windowWidth * startX);
    //    this.startLineY = (int) (windowHeight * startY);
    //    this.endLineX = (int) (windowWidth * endX);
    //    this.endLineY = (int) (windowHeight * endY);
    //}

    public void drawLine(float startX, float startY, float endX, float endY){
        startX = setX(startX);
        startY = setY(startY);
        endX = setX(endX);
        endY = setY(endY);
        System.out.println("Draw line with startx: " + startX + " starty: " + startY +
                " endx: " + endX + " endy " + endY);
        //calculate in coordinates
        super.setColor(Color.BLACK);
        //setccords(startX, startY, endX, endY);

        //do the drawing
<<<<<<< HEAD
        super.drawLine(startX,startY,endX,endY);

=======
        super.drawLine(Math.round(startLineX),Math.round(startLineY),Math.round(endLineX),Math.round(endLineY));
>>>>>>> 9aacecf6628979f153213205c3674a9f6390d44f
    }

    public void drawRect(float LeftTopX ,float LeftTopY,float RightBottomX, float RightBottomY, Color col){

        LeftTopX = setX(LeftTopX);
        LeftTopY = setY(LeftTopY);
        RightBottomX = setX(RightBottomX);
        RightBottomY = setY(RightBottomY);
        System.out.println("Drawing rectangle  with parameters: "
                            +LeftTopX+" "+ LeftTopY+" "+ RightBottomX + " "+ RightBottomY);

        super.drawRect(LeftTopX , LeftTopY, RightBottomX, RightBottomY);

        System.out.println("Filling rectangle  with parameters: "
                +LeftTopX+" "+ LeftTopY+" "+ RightBottomX + " "+ RightBottomY);
        super.setColor(col);
        super.fillRect(LeftTopX , LeftTopY, RightBottomX, RightBottomY);
        addNewWindow(LeftTopX ,LeftTopY, RightBottomX,  RightBottomY);
    }

    /*
     * Add new simple window to window system
     */
<<<<<<< HEAD
    public void AddNewWindow(float LeftTopX ,float LeftTopY,float RightBottomX, float RightBottomY){

        LeftTopX = setX(LeftTopX);
        LeftTopY = setY(LeftTopY);
        RightBottomX = setX(RightBottomX);
        RightBottomY = setY(RightBottomY);
        simpleWindows.add(
                new SimpleWindow(LeftTopX ,LeftTopY, RightBottomX,  RightBottomY)

        );

=======
    public void addNewWindow(int leftTopX ,int leftTopY,int rightBottomX, int rightBottomY){
        simpleWindows.add(new SimpleWindow(leftTopX, leftTopY, rightBottomX, rightBottomY));
>>>>>>> 9aacecf6628979f153213205c3674a9f6390d44f
    }

    /*
     * (non-Javadoc)
     * override handle paint in parent
     * Set color and draw line using parent methods
     */


    public List<SimpleWindow> getListWindows(){return simpleWindows;}
    @Override
    protected void handlePaint(){

<<<<<<< HEAD






        this.drawRect(0.5f,0.5f,1.0f,1.0f,Color.GRAY);
        this.drawRect(0.1f,0.1f,0.2f,0.2f,Color.GRAY);
        this.drawRect(0.3f,0.3f,0.4f,0.4f,Color.GRAY);
        for (SimpleWindow t:simpleWindows
             ) {System.out.println("Id is: "+ t.getID());

        }






=======
        //for (Rectangle temp:rectBuffer) {
        System.out.println("rectangle1");
        this.drawRect(5,5,50,50);
        this.drawRect(300,300,600,600);
        this.drawRect(200,200,400,400);
        for (SimpleWindow t:simpleWindows) {
            System.out.println(t.getID());
        }

        System.out.println("rectangle2");
>>>>>>> 9aacecf6628979f153213205c3674a9f6390d44f
    }


}
