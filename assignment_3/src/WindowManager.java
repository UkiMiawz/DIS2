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
    private int closeButtonLeftX;
    private int closeButtonLeftY;
    private int closeButtonRightX;
    private int getCloseButtonRightY;
    private int titleX;
    private int titleY;

    private final Color headerSquareColor = Color.orange;
    private final Color windowColor = Color.WHITE;
    private final Color closeButtonColor = Color.RED;

    private final int titleBarHeight = 20;
    private final int closeButtonHeight = 20;
    private final int closeButtonWidth  = 20;

    private SimpleWindow currentActiveWindow;

    /*
    * Constructor
    */
    public WindowManager(WindowSystem windowSystem) {
        this.windowSystem = windowSystem;
    }

    /*
    * Redraw all windows in the list
    */
    public void redrawAllWindows(){
            listWindows = windowSystem.getListWindows();

            for (SimpleWindow t:listWindows) {
                redrawWindow(t);
            }
    }

    public void redrawWindow(SimpleWindow t){
        t.setFillColorWindowColor(windowColor);

        //add header bar
        System.out.println("Adding header bar to window " + t.getTitle());
        System.out.println("Window properties " + t.getLeftTopX() + " " + t.getLeftTopY() + " " 
            + t.getWidth() + " " + t.getHeight());

        int titleBarLeftX = t.getLeftTopX();
        int titleBarLeftY = t.getLeftTopY();//- titleBarHeight;

        int titleBarWidth = t.getWidth();

        int closeButtonLeftX = t.getRightBottomX() - closeButtonWidth;
        int closeButtonLeftY = t.getLeftTopY();

        int titleX = t.getLeftTopX();
        int titleY = t.getLeftTopY();

        System.out.println("Title bar position now " + titleBarLeftX + " " + titleBarLeftY);
        RectangleComponent titleBar = new RectangleComponent(titleBarLeftX, titleBarLeftY, titleBarWidth,
            titleBarHeight, headerSquareColor);
        t.addNewComponent(titleBar);
        RectangleComponent closeButton = new RectangleComponent(closeButtonLeftX,closeButtonLeftY,closeButtonWidth,
                closeButtonHeight, closeButtonColor);
        t.addNewComponent(closeButton);

        windowSystem.requestRepaint();            
    }

    public void handleMouseClicked(int x, int y){
        System.out.println("Window manager - Mouse clicked with x " + x + " and y " + y);
        currentActiveWindow = null;
    }

    public void handleMouseDragged(int x, int y){
        System.out.println("Window manager - Mouse dragged with x " + x + " and y " + y);
        currentActiveWindow = null;
    }

    public void handleMouseReleased(int x, int y){
        System.out.println("Window manager - Mouse released with x " + x + " and y " + y);
        currentActiveWindow = null;
    }

    public void handleMousePressed(int x, int y){
        System.out.println("Window manager - Mouse pressed with x " + x + " and y " + y);

        setActiveWindow(x, y);
        if(currentActiveWindow != null){
            //reorder window
            windowSystem.getListWindows().remove(currentActiveWindow);
            windowSystem.getListWindows().add(currentActiveWindow);
        }
        windowSystem.requestRepaint();
        //clear active window
        currentActiveWindow = null;
    }

    private void setActiveWindow(int x, int y){
        listWindows = windowSystem.getListWindows();
        for(int i=listWindows.size()-1; i >= 0 ;i--){
           SimpleWindow window = listWindows.get(i);
           if((window.getLeftTopX() < x && x < window.getLeftTopX() + window.getWidth())
                   && (window.getLeftTopY() < y && y < window.getLeftTopY()+window.getHeight()) )
           {
               System.out.println("window found " + window.getId());
               currentActiveWindow = window;
               break;   
           }
       }
    }
}