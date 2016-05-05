import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class WindowManager  {

    private List<SimpleWindow> listWindows;
    private WindowSystem windowSystem;

    private int titleBarLeftX;
    private int titleBarLeftY;
    private int titleBarRightX;
    private int titleBarRightY;

    private final Color headerSquareColor = Color.BLUE;
    private final Color windowColor = Color.LIGHT_GRAY;

    private final int titleBarHeight = 20;

    public WindowManager(WindowSystem windowSystem) {
        this.windowSystem = windowSystem;
        listWindows = windowSystem.getListWindows();
        
        for (SimpleWindow t:listWindows) {

            t.setColor(windowColor);

            //add header bar
            System.out.println("Adding header bar to window " + t.getTitle());
            System.out.println("Window properties " + t.getLeftTopX() + " " + t.getLeftTopY() + " " 
                + t.getWidth() + " " + t.getHeight());

            int titleBarLeftX = t.getLeftTopX();
            int titleBarLeftY = t.getLeftTopY() - titleBarHeight;
            int titleBarWidth = t.getWidth();

            System.out.println("Title bar position now " + titleBarLeftX + " " + titleBarLeftY);
            RectangleComponent titleBar = new RectangleComponent(titleBarLeftX, titleBarLeftY, titleBarWidth, 
                titleBarHeight, headerSquareColor);
            t.addNewComponent(titleBar);

            windowSystem.requestRepaint(titleBarLeftX, titleBarLeftY, t.getWidth(), t.getHeight() + titleBarHeight);
        }

    }
}
