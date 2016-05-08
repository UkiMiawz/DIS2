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
    private Color shadowColor = new Color(0f,0f,0f,.5f);

    private final int titleBarHeight = 20;
    private final int closeButtonHeight = 20;
    private final int closeButtonWidth  = 20;

    private SimpleWindow currentActiveWindow;

    public Color getShadowColor(){ return shadowColor; }

    /*
    * Constructor
    */
    public WindowManager(WindowSystem windowSystem) {
        this.windowSystem = windowSystem;
    }

    /*
    * Add all components to a window
    */
    public void redrawWindow(SimpleWindow t){
        t.setFillColorWindowColor(windowColor);

        //add header bar
        System.out.println("Adding header bar to window " + t.getTitle());
        System.out.println("Window properties " + t.getLeftTopX() + " " + t.getLeftTopY() + " " 
            + t.getWidth() + " " + t.getHeight());

        int titleBarLeftX = t.getLeftTopX();
        int titleBarLeftY = t.getLeftTopY();

        int titleBarWidth = t.getWidth();

        int titleX = t.getLeftTopX();
        int titleY = t.getLeftTopY();

        //add title bar
        System.out.println("Title bar position now " + titleBarLeftX + " " + titleBarLeftY);
        RectangleComponent titleBar = new RectangleComponent(titleBarLeftX, titleBarLeftY, titleBarWidth,
            titleBarHeight, headerSquareColor);
        t.addNewComponent(titleBar);

        int closeButtonLeftX = t.getRightBottomX() - closeButtonWidth;
        int closeButtonLeftY = t.getLeftTopY();

        //add close button
        RectangleComponent closeButton = new RectangleComponent(closeButtonLeftX,closeButtonLeftY,closeButtonWidth,
                closeButtonHeight, closeButtonColor);
        t.addNewComponent(closeButton);

        windowSystem.requestRepaint();
    }

    public void handleMouseClicked(int x, int y){
        System.out.println("Window manager - Mouse clicked with x " + x + " and y " + y);
        //setActiveWindow(x, y);
        //if(currentActiveWindow != null){
            //reorder window
          //  windowSystem.getListWindows().remove(currentActiveWindow);
           // windowSystem.getListWindows().add(currentActiveWindow);
        //}
        //windowSystem.requestRepaint();
        //currentActiveWindow = null;
//        setActiveWindow(x,y);
//        SimpleWindow window = listWindows.get(listWindows.size()-1);
//        if(isClose(x,y,window)){ listWindows.remove(listWindows.size()-1);
//            System.out.print("That is Close button on" + x + " " + y);}
//        windowSystem.requestRepaint();
    }

    public void handleMouseDragged(int x, int y){
        System.out.println("Window manager - Mouse dragged with x " + x + " and y " + y);
        setActiveWindow(x,y);
        if(currentActiveWindow != null){
            currentActiveWindow.setLeftTopX(x);
            currentActiveWindow.setLeftTopY(y);
            currentActiveWindow.resetComponents();
            redrawWindow(currentActiveWindow);
        }
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
        currentActiveWindow = null;
    }

    private void setActiveWindow(int x, int y){
        //get copy of list of windows
        listWindows = windowSystem.getListWindows();
        //iterate through the windows (backwards since element on tail are on top) and search for one which contains x,y coords
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

//    boolean isClose(int x , int y,SimpleWindow window){
//
//        boolean isClose = false;
//        List<RectangleComponent> components =  window.getRectangleComponents();
//        for(int i = components.size()-1;i>=0;i--){
//            RectangleComponent component = components.get(i);
//            if(window.getLeftTopX()+window.getWidth()-20 <  component.getX()
//                    && component.getX() < window.getLeftTopX()+20
//                    && window.getLeftTopY() < component.getY()
//                    && component.getY() < window.getLeftTopY() + 20)
//            {isClose = true;
//             break;}
//
//        }
//        if (isClose){return true;}
//        else {return false;}
//    }
}
