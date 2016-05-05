import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WindowManager  {
    private List<SimpleWindow> listWindows;
    private int titleBarLeftX;
    private int titleBarLeftY;
    private int titleBarRightX;
    private int titleBarRightY;

    public WindowManager(WindowSystem windowSystem) {
         listWindows = windowSystem.getListWindows();
        for (SimpleWindow t:listWindows) {

            titleBarLeftX = windowSystem.setX(t.getLeftTopX());
            titleBarLeftY = windowSystem.setY((float) (t.getLeftTopY()- Math.abs((t.getLeftTopY()-t.getRightBottomY())*0.05)));
            titleBarRightX = windowSystem.setX(t.getLeftTopX());
            titleBarRightY = (int) (titleBarLeftY );
        }

    }
}
