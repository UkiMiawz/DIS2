import java.awt.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by asifmayilli on 5/5/16.
 */
public class WindowManager  {
    private List<SimpleWindow> listWindows;
    private int titleBarLeftX;
    private int titleBarLeftY;
    private int titleBarRightX;
    private int titleBarRightY;


    public WindowManager(WindowSystem windowSystem) {
         listWindows = windowSystem.getListWindows();
        for (SimpleWindow t:listWindows
             ) {
            titleBarLeftX = windowSystem.setX(t.getLeftTopX());
            titleBarLeftY = windowSystem.setY((float) (t.getLeftTopY()- Math.abs((t.getLeftTopY()-t.getRightBottomY())*0.05)));
            titleBarRightX = windowSystem.setX(t.getLeftTopX());
            titleBarRightY = (int) (titleBarLeftY );

            windowSystem.drawRect(titleBarLeftX,titleBarLeftY,titleBarRightX,titleBarRightY, Color.BLACK);
            windowSystem.handlePaint();
            
        }



        //        for (SimpleWindow t:simpleWindows
        //) {System.out.println("Id is: "+ t.getID());
        //}

    }


    //windowSystem.drawLine(1,2,3,4);
}
