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
    public List<SimpleWindow> getListWindows(){return simpleWindows;}

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
    }

    //coordinate converter
    public int setX(float x){ return (int) Math.round(x * windowWidth); }
    public int setY(float y){ return (int) Math.round(y * windowHeight); }

    /*
     * Add new window to simple windows
     */
    public void addNewWindow(float startX, float startY, int width, int height, String title){

        System.out.println("Add new window with properties vector: " + startX + " starty: " + startY + 
                " width: " + width + " height " + height);

        //calculate in coordinates
        int intStartX = setX(startX);
        int intStartY = setY(startY);

        System.out.println("Add new window with coordinates startx: " + intStartX + " starty: " + intStartY + 
                " width: " + width + " height " + height);

        simpleWindows.add(new SimpleWindow(intStartX, intStartY, width,  height, title));
        System.out.println("Windows list count now " + simpleWindows.size());

        super.requestRepaint(new Rectangle(intStartX, intStartY, width, height));
    }

    /*
     * (non-Javadoc)
     * override handle paint in parent
     * Set color and draw line using parent methods
     */
    @Override
    protected void handlePaint(){

        for(SimpleWindow t:simpleWindows) {

            int leftTopX = t.getLeftTopX();
            int leftTopY = t.getLeftTopY();
            int rightBottomX = t.getRightBottomX();
            int rightBottomY = t.getRightBottomY();

            System.out.println("drawing window rectangle");
            super.setColor(Color.GRAY);
            super.fillRect(leftTopX , leftTopY, rightBottomX, rightBottomY);
            super.setColor(Color.BLACK);
            super.drawRect(leftTopX , leftTopY, rightBottomX, rightBottomY);
        }
    }
}
